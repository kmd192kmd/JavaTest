package com.test.java.problemsolve;

public class Problem100 {

	public static void main(String[] args) {
		
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	
	}
	
}

class Packer{
	
	static int pencilCount = 0;
	static int eraserCount = 0;
	static int ballPointPenCount = 0;
	static int rulerCount = 0;
	
	void packing(Pencil pencil) {
		
		System.out.println("포장 전 검수: " + pencil.info() + "\n포장을 완료했습니다.");
		pencilCount++;
		
	}
	
	void packing(Eraser eraser) {
		
		System.out.println("포장 전 검수: " + eraser.info() + "\n포장을 완료했습니다.");
		eraserCount++;
	}
	
	void packing(BallPointPen ballPointPen) {
		
		System.out.println("포장 전 검수: " + ballPointPen.info() + "\n포장을 완료했습니다.");
		ballPointPenCount++;
	}
	
	void packing(Ruler ruler) {
		
		System.out.println("포장 전 검수: " + ruler.info() + "\n포장을 완료했습니다.");
		rulerCount++;
	}
	
	void countPacking(int type) {
		
		System.out.println("====================\n포장 결과\n====================");
		
		switch(type) {
	    case 0:
	        System.out.println("연필 " + pencilCount + "회");
	        System.out.println("지우개 " + eraserCount + "회");
	        System.out.println("볼펜 " + ballPointPenCount + "회");
	        System.out.println("자 " + rulerCount + "회");
	        break;
	    case 1:
	        System.out.println("연필 " + pencilCount + "회");
	        break;
	    case 2:
	        System.out.println("지우개 " + eraserCount + "회");
	        break;
	    case 3:
	        System.out.println("볼펜 " + ballPointPenCount + "회");
	        break;
	    case 4:
	        System.out.println("자 " + rulerCount + "회");
	        break;
	    default:
	        System.out.println("잘못된 타입입니다.");
	}
		
	
	}
	
}

class Pencil{
	
	private String hardness;
	
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

	public String info() {
		
		return hardness + " 진하기 연필입니다.";
		
	}
	
}

class Eraser{
	
	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String info() {
		
		return size + " 사이즈 지우개입니다.";
	}
	
}

class BallPointPen{
	
	private double thickness;
	private String color;

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		
		return color + " 색상 " + thickness + "mm 볼펜입니다.";
		
	}
	
}

class Ruler {
	
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		
		return length + "cm " + shape + "입니다.";
		
	}
	
}