package com.test.java.problemsolve;

public class Problem93 {
	
	public static void main(String[] args) {
		
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		
		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
		
	}
	
}

class Note{
	
	private String size = "A5";
	private String color = "흰색";
	private int page = 10;
	private String owner;
	private int price;

	public void setSize(String size) {
		if(size.equals("A3") || size.equals("A4") || size.equals("A5") 
				|| size.equals("B3") || size.equals("B4") || size.equals("B5")) {
			this.size = size;
		} else {
			System.out.println("올바른 사이즈가 아닙니다.");
		}
	}
	
	public void setColor(String color) {
		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") 
				|| color.equals("파란색")) {
			this.color = color;
		}
	}
	
	public void setPage(int page) {
		if(page < 10 || page > 200) {
			System.out.println("올바른 페이지 수가 아닙니다.(10 ~ 200페이지 이내)");
		} else {
			this.page = page;
		}
		
	}
	
	public void setOwner(String owner) {
		if(owner.length() < 2 || owner.length() > 5) {
		}
		this.owner = owner;
	}

	public String info() {
		
		String thickness;
		
		if(page <= 50) {
			thickness = "얇은";
		} else if(page <= 100) {
			thickness = "보통";
		} else {
			thickness = "두꺼운";
		}
		
		price = 500;
		
		if(size.equals("A3")) {
			price += 400;
		} else if(size.equals("A4")) {
			price += 200;
		} else if(size.equals("B3")) {
			price += 500;
		} else if(size.equals("B4")) {
			price += 300;
		} else if(size.equals("B5")) {
			price += 100;
		}
		
		if(color.equals("검정색")) {
			price += 100;
		} else if(color.equals("노란색")) {
			price += 200;
		} else if(color.equals("파란색")) {
			price += 200;
		}
		
		price += (page-10)*10;
		
		if(owner == null) {
			return String .format("■■■■■■ 노트 정보 ■■■■■■\n"
					+ "주인 없는 노트\n"
					+ "■■■■■■■■■■■■■■■■■■■■");
		}
		
		return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
				+ "소유자: %s\n"
				+ "특성: %s %s %s노트\n"
				+ "가격: %,d원\n"
				+ "■■■■■■■■■■■■■■■■■■■■", owner, color, thickness, size, price);
		
	}
	
}