package com.test.java.problemsolve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem95 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();
		

		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
		
		Employee e3 = new Employee();

		e3.setName("고양이");
		e3.setDepartment("개발부");
		e3.setPosition("과장");
		e3.setTel("010-2541-856");
		e3.setBoss(e1); //직속 상사 e1(홍길동)

		e3.info();
		
	}
	
}

class Employee{
	
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 5) {
			this.name = name;
		} else if(name.length() < 2 || name.length() > 5){
			System.out.println("이름은 한글 2~5자 이내여야 합니다.");
		} else {
			System.out.println("올바른 형식의 한글 이름을 입력해 주십시오.");
		}
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		if(department.equals("영업부") || department.equals("기획부") || department.equals("총무부")
				|| department.equals("개발부") || department.equals("홍보부")) {
			this.department = department;
		} else {
			System.out.println("부서 이름은 영업부, 기획부, 총무부, 개발부, 홍보부 중 하나여야 합니다.");
		}
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		if(position.equals("부장") || position.equals("과장") || position.equals("대리")
				|| position.equals("사원")) {
		this.position = position;
		} else {
			System.out.println("직책은 부장, 과장, 대리, 사원 중 하나여야 합니다.");
		}
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		String regexTel = "^01(?:0|1|[6-9])-?\\d{3,4}-?\\d{4}$";
		Pattern p = Pattern.compile(regexTel);
		Matcher matcher = p.matcher(tel);
		
		if(matcher.matches()) {
			this.tel = tel;
		} else {
			System.out.println("올바른 형식의 전화번호를 입력해 주십시오. "
					+ "(예시: 010-XXXX-XXXX)");
		}
	}
	
	public Employee getBoss() {
		return boss;
	}
	
	public void setBoss(Employee boss) {
		
		if(boss == null) {
			this.boss = null;
			return;
		}
		
		if(this == boss) {
			System.out.println("자신이 자신의 직속상사가 될 수 없습니다.");
			return;
		}
		
		if(!this.department.equals(boss.getDepartment())) {
			System.out.println("직속상사는 같은 부서여야 합니다.");
			return;
		}
		this.boss = boss;
		
	}
	
	
	public void info() {
		
		String hasBoss = (boss == null) ? "없음" : String.format("%s(%s)", 
				boss.getName(), boss.getPosition());
		
		System.out.printf("[%s]\n"
				+ "부서:%s\n"
				+ "직위:%s\n"
				+ "연락처:%s\n"
				+ "직속상사:%s\n\n", name, department, position, tel, hasBoss);
		
	}
	
	
	
}