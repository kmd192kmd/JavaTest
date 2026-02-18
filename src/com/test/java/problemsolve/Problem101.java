package com.test.java.problemsolve;

public class Problem101 {

	public static void main(String[] args) {
		
		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}

		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//결산
		barista.result();
		
	}
	
}

class Barista{
	
	Espresso makeEspresso(int bean) {
		
		Coffee.bean += bean;
		Coffee.espresso++;
		
		return new Espresso(bean);
		
	}

	Espresso[] makeEspressoes(int bean, int count) {
		
		Espresso[] arr = new Espresso[count];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = makeEspresso(bean);
		}
		
		return arr;
		
	}
	
	Latte makeLatte(int bean, int milk) {
		
		Coffee.bean += bean;
		Coffee.milk += milk;
		Coffee.latte++;
		
		return new Latte(bean, milk);
		
	}
	
	Latte[] makeLattes(int bean, int milk, int count) {
		
		Latte[] arr = new Latte[count];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = makeLatte(bean, milk);
		}

		
		return arr;
		
	}
	
	Americano makeAmericano(int bean, int water, int ice) {
		
		Coffee.bean += bean;
		Coffee.water += water;
		Coffee.ice += ice;
		Coffee.americano++;
		
		
		return new Americano(bean, water, ice);
		
	}
	
	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
		Americano[] arr = new Americano[count];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = makeAmericano(bean, water, ice);
		}
		
		return arr;
		
	}
	
	void result() {
		
		Coffee.calculate();
		
		System.out.println("==========\n판매 결과\n==========\n");
		System.out.println("----------\n음료판매량\n----------");
		System.out.println("에스프레소: " + Coffee.espresso + "잔");
		System.out.println("아메리카노: " + Coffee.americano + "잔");
		System.out.println("라테: " + Coffee.latte + "잔");
		System.out.println();
		System.out.println("----------\n원자재 소비량\n----------");
		System.out.printf("원두: %,dg\n"
				+ "물: %,dml\n"
				+ "얼음: %,d개\n"
				+ "우유: %,dml\n", Coffee.bean, Coffee.water, Coffee.ice, Coffee.milk);
		System.out.println();
		System.out.println("----------\n매출액\n----------");
		System.out.printf("원두: %,d원\n"
				+ "물: %,.0f원\n"
				+ "얼음: %,d원\n"
				+ "우유: %,d원\n", Coffee.beanTotalPrice, Coffee.waterTotalPrice, Coffee.iceTotalPrice, Coffee.milkTotalPrice);
	}
	
}

class Coffee{
	
	static int bean;
	static int ice;
	static int water;
	static int milk;
	static int beanUnitPrice = 1;
	static double waterUnitPrice = 0.2;
	static int iceUnitPrice = 3;
	static int milkUnitPrice = 4;
	static int beanTotalPrice;
	static double waterTotalPrice;
	static int iceTotalPrice;
	static int milkTotalPrice;
	static int americano;
	static int latte;
	static int espresso;
	
	static void calculate() {
		Coffee.beanTotalPrice = Coffee.beanUnitPrice * Coffee.bean;
		Coffee.waterTotalPrice = Coffee.waterUnitPrice * Coffee.water;
		Coffee.iceTotalPrice = Coffee.iceUnitPrice * Coffee.ice;
		Coffee.milkTotalPrice = Coffee.milkUnitPrice * Coffee.milk;
	}

}

class Espresso{
	
	private int bean;
	
	public Espresso(int bean) {
		this.bean = bean;
	}

	void drink() {
		System.out.println("원두 " + bean + "g으로 만들어진 에스프레소를 마십니다.");
	}
	
}

class Latte{
	
	private int bean;
	private int milk;
	
	public Latte(int bean, int milk) {
		this.bean = bean;
		this.milk = milk;
	}

	void drink() {
		System.out.println("원두 " + bean + "g, 우유 " + milk + "ml으로 만들어진 라테를 마십니다.");
	}
	
}

class Americano{
	
	private int bean;
	private int water;
	private int ice;
	
	public Americano(int bean, int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}

	void drink() {
		System.out.println("원두 " + bean + "g, 물 " + water + "ml, 얼음 " + ice + "개로 만들어진 아메리카노를 마십니다.");
	}
	
}