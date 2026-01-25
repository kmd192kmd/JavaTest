package com.test.java.obj;

public class Ex35_Class {
	
	public static void main(String[] args) {
		
		m1();
		
	}

	private static void m1() {
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setDepartment("영업부");
		
		Employee e2 = new Employee();
		e2.setName("아무개");
		e2.setDepartment("영업부");
		
		//Case 1.
		//아무개의 직속상사 > 홍길동
		//e2.setBossName("홍길동");
		//e2.setBossDepartment("영업부");
		
		//Case 2.
		//e2.setBossName(e1.getName());
		//e2.setBossDepartment(e1.getDepartment());
		
		//Case 3.
		e2.setBoss(e1);
		
		
		//com.test.java.obj.Employee@5305068a
		//System.out.println(e2);
		//System.out.println(e2.toString());
		
		//[I@1f32e575 //@뒤는 실제 주소값은 아니지만 비슷한 의미를 가지는 해시코드
		//int[] num = new int[3];
		//System.out.println(num);
		//System.out.println(num.toString());
		
		//[[I@279f2327
		//int[][] num2 = new int[2][3];
		//System.out.println(num2);
		
//		System.out.println(e2.getName());
//		System.out.println(e2.getDepartment());
//		System.out.println(e2.getBossName());
//		System.out.println(e2.getBossDepartment());
		System.out.println(e2.info());
		
	}

}

//사원 클래스
class Employee {
	
	private String name; //직원명
	private String department; //부서명
	
	//private String bossName; //상사명
	//private String bossDepartment; //상사의 
	
	private Employee boss; //상사
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	public String getBossName() {
//		return bossName;
//	}
//	public void setBossName(String bossName) {
//		this.bossName = bossName;
//	}
//	public String getBossDepartment() {
//		return bossDepartment;
//	}
//	public void setBossDepartment(String bossDepartment) {
//		this.bossDepartment = bossDepartment;
//	}
	
	public Employee getBoss() {
		return boss;
	}
	public void setBoss(Employee boss) {
		this.boss = boss;
	}
	
	//개발용(디버깅용)
	public String info() {
		
		//return name + "," + department + "," + bossName + "," + bossDepartment;
		
		//void System.out.printf("%s" , name); //이걸로 return 불가능
		//String String.format("%s", name);
		
		return String.format("직원명: %s\n부서명: %s\n상사명: %s\n상사부서명: %s\n" 
				,name
				,department
				,boss.getName()
				,boss.getDepartment());
		
	}
	
}