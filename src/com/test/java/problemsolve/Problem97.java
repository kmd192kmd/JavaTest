package com.test.java.problemsolve;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem97 {
	
	public static void main(String[] args) {
		
		Refrigerator r = new Refrigerator();

		r.listItem();
		
		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("202-03-04");
		//item1.setExpiration("2026-03-04");
		r.add(item1);//냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2026-02-25");
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2026-02-27");
		r.add(item3);//냉장고에 넣기

		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
		
		Item item5 = r.get("깍두기");
		if(item5 != null) {
			System.out.printf("%s의 유통기한 : %s\n", item5.getName(), item5.getExpiration());
		} else {
			System.out.println("해당 아이템을 찾을 수 없습니다.");
		}

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());
	}

}

class Refrigerator{
	
	private Item[] list = new Item[100];
	private int count = 0;
	
	public void add(Item item) {
		
		if(list[count] != null) {
			System.out.println("냉장고가 꽉 찼습니다.");
			return;
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i] == null) {
				list[i] = item;
				count++;
				System.out.printf("\'%s\'를 냉장고에 넣었습니다.\n", item.getName());
				return;
			}
		}
		
	}
	
	public Item get(String name) {
		
		if(list[0] == null) {
			System.out.println("냉장고가 비었습니다.");
			return null;
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i] != null && list[i].getName().equals(name)) {
				Item item = list[i];
				
				for(int j=i; j<list.length-1; j++) {
					list[j] = list[j+1];
				}
				list[list.length-1] = null;
				count --;
				
				return item;
			}
		}
		System.out.println("냉장고에 해당 아이템이 없습니다.");
		return null;
		
	}
	
	public int count() {
		
		return count;
	}
	
	public void listItem() {
		
		System.out.println("[냉장고 아이템 목록]");
		
		if(list[0] == null) {
			System.out.println("냉장고에 물건이 없습니다.");
			return;
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				System.out.printf("%s(%s)\n", list[i].getName(), list[i].getExpiration());
			} else {
				return;
			}
		}
		
	}
	
}

class Item{
	
	private String name;
	private Calendar expiration;
	
	public String getName() {
		if(this.name == null) {
			System.out.println("해당 아이템은 이름이 설정되지 않았습니다.");
			return "이름 미설정";
		}
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getExpiration() {
		
		if(this.expiration == null) {
			System.out.println("해당 아이템은 유통기한이 설정되지 않았습니다.");
			return "유통기한 미설정";
		}
		
		return String.format("%04d-%02d-%02d", expiration.get(expiration.YEAR), expiration.get(expiration.MONTH) + 1, expiration.get(expiration.DATE));
	}
	
	public void setExpiration(String date) {
		
		String regex = "^\\d{4}-\\d{1,2}-\\d{1,2}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(date);
		
		if(!m.matches()) {
			System.out.println("올바른 형식의 유통기한을 설정해 주십시오.");
			return; 
		}
		
		Calendar cal = Calendar.getInstance();
		
		String[] dateList = date.split("-");
		
		cal.set(Integer.parseInt(dateList[0]), Integer.parseInt(dateList[1]) - 1, Integer.parseInt(dateList[2]));
		
		this.expiration = cal;
	}
	
	
	
}
