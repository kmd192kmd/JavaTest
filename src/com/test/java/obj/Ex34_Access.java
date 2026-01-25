package com.test.java.obj;

public class Ex34_Access {
	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		
		m1.setModel("VXE");
		System.out.println(m1.getModel());
		
		//객체의 price 상태 > 쓰기 전용
		m1.setPrice(35000);
		//System.out.println(m1.getPrice()); //set만 있고 get은 없는 상태
		
		//price를 public으로 두고 변수를 사용하여 읽고 쓰는 경우는 쓰기전용, 읽기전용으로 설정할 수 없다.
		//m1.price = 50000;
		//System.out.println(m1.price);
		
		//읽기 전용 멤버
		//m1.setColor("yellow"); //get만 있고 set은 없는 상태 //color가 price에 의해 정해지는 상태
		System.out.println(m1.getColor());
		
		
		m1.setButtons(5);
		
		//프로퍼티(Property) > 속성
		//- 객체의 상태(객체가 가지고 있는 데이터)
		//- Setter/Getter //진정한 의미의 프로퍼티는 멤버변수라고 할 수 있지만 set/get메서드도 프로퍼티라고 한다.
		
		//쓰기 전용 멤버 > 계산된 프로퍼티, 가상 프로퍼티
		//- 아~ 멤버 변수 type이라는게 있는데.. 그 값을 반환하는구나.. 라고 생각하게됨. //하지만 실제로 멤버변수로 type은 없는 상태
		System.out.println(m1.getType());
		
	}
}

//클래스 > 객체 생성 > 객체(데이터:변수 + 행동:메서드)
class Mouse {
	
	private String model;
	private int price;
	private String color;
	private int buttons;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		//유효성 검사 
		
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		
		//멤버변수 color가 이미 있다.
		
		if(price >= 0 && price <= 10000) {
			color  = "black";
		} else if (price <= 30000) {
			color = "white";
		} else {
			color = "gold";
		}
		
		return color;
	}
	
	public void setButtons(int buttons) {
		this.buttons = buttons;
	}
	
	public String getType() {
		
		String type = "";
		
		if(buttons <= 3) {
			type = "초보자용";
		} else if (buttons <= 5) {
			type = "사무용";
		} else {
			type = "전문가용";
		}
		
		return type;
		
	}
	
}