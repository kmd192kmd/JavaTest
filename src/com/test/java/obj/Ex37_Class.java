package com.test.java.obj;

public class Ex37_Class {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(20);
		
		String[] nick = { "천재", "고집불통", "멍멍이"};
		
		p1.setNick(nick);
		
		//String[] temp = p1.getNick();
		//temp[0] ... 
		
		System.out.println(p1.getNick()[0]);
		System.out.println(p1.getNick()[1]);
		System.out.println(p1.getNick()[2]);
		
	}
}

class Address{
	
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;
	
	
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	
	
	
}

class Person{
	
	private String name;
	private int age;
	
	//주소
	//private String address; //서울시 강남구 대치동 10번지
	//private String sido;
	//private String gugun;
	//private String dong;
	//private String bunji;
	private Address address;
	
	//별명
	//private String nick1;
	//private String nick2;
	//private String nick3;
	private String[] nick = new String[3];
	
	
	public String[] getNick() {
		return nick;
	}
	public void setNick(String[] nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}