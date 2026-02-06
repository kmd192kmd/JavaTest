package com.test.java.problemsolve;

import java.time.LocalDate;
import java.util.Calendar;

public class Problem94 {

	public static void main(String[] args) {
		
		Bugles snack = new Bugles();
		
		snack.setSize(500);
		snack.setCreationTime("2026-02-01");
		System.out.println("가격:" + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		
		snack.eat();
		
		
		Bugles snack2 = new Bugles();
		
		snack2.setSize(300);
		snack2.setCreationTime("2026-01-24");
		System.out.println("가격:" + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		
		snack2.eat();
		
	}
	
}

class Bugles{
	
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;
	
	public void setSize(int weight) {
        this.weight = weight;
        if (weight == 300) {
            this.price = 850;
            this.expiration = 7;
        } else if (weight == 500) {
            this.price = 1200;
            this.expiration = 10;
        } else if (weight == 850) {
            this.price = 1950;
            this.expiration = 15;
        }
    }
	
	public void setCreationTime(String date) {
		
		String[] parts = date.split("-");
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])-1, Integer.parseInt(parts[2]));
		
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		this.creationTime = cal;
		
	}
	public int getPrice() {
		return price;
	}
	public int getExpiration() {
		
		Calendar now = Calendar.getInstance();
		
		now.set(Calendar.HOUR_OF_DAY, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		
		long diff = (now.getTimeInMillis() - creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24;

		return this.expiration - (int)diff;
	}
	
	public void eat() {
		int remain = getExpiration();
		if(remain >= 0) {
			System.out.println("과자를 맛있게 먹습니다.\n");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
		}
	}
	
}