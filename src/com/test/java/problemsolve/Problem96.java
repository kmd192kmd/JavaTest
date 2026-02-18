package com.test.java.problemsolve;

import java.util.Random;

public class Problem96 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		box1.cook();
		box1.check();
		box1.list();
		
	}
	
}

class Box{
	
	private Macaron[] list = new Macaron[10];
	
	Random rnd = new Random();
	
	public void cook() {
		
		int[] arrSize = new int[11];
		for(int i=0; i<11; i++) {
			arrSize[i] = i + 5;
		}
		
		String[] arrColor = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		int[] arrThickness = new int[20];
		for(int i=0; i<20; i++) {
			arrThickness[i] = i + 1;
		}
		
		int size_num = -1;
		int color_num = -1;
		int thickness_num = -1;
		
		for(int i=0; i<list.length; i++) {
			size_num = rnd.nextInt(arrSize.length);
			color_num = rnd.nextInt(arrColor.length);
			thickness_num = rnd.nextInt(arrThickness.length);
			list[i] = new Macaron(arrSize[size_num], arrColor[color_num], arrThickness[thickness_num]);
		}
		System.out.println("마카롱을 10개 만들었습니다.");
	}
	
	public void check() {
		
		int passQC = 0;
		int failQC = 0;
		
		for(int i=0; i<list.length; i++) {
			if(isPass(list[i])) {
				passQC++;
			} else {
				failQC++;
			}
		}
		
		System.out.println("QC합격개수: " + passQC + "개");
		System.out.println("QC불합격개수: " + failQC + "개");
		
		
	}
	
	public void list() {
		
		for(int i=0; i<list.length; i++) {
			if(isPass(list[i])) {
				System.out.printf("%d번 마카롱:%dcm(%s,%dmm):합격\n",
						i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
			} else {
				System.out.printf("%d번 마카롱:%dcm(%s,%dmm):불합격\n",
						i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
			}
		}
		
//		for(int i=0; i<10; i++) {
//			if(list[i].getSize() < 8 || list[i].getSize() > 14) {
//				System.out.printf("%d번 마카롱:%dcm(%s,%dmm):불합격\n", 
//						i + 1, list[i].getSize(), list[i].getColor(),list[i].getThickness());
//				continue;
//			} else if(list[i].getColor().equals("black")){
//				System.out.printf("%d번 마카롱:%dcm(%s,%dmm):불합격\n",
//						i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
//				continue;
//			} else if(list[i].getThickness() < 3 || list[i].getThickness() > 18) {
//				System.out.printf("%d번 마카롱:%dcm(%s,%dmm):불합격\n",
//						i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
//				continue;
//			}
//			System.out.printf("%d번 마카롱:%dcm(%s,%dmm):합격\n",
//					i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
//		}
		
	}
	
	private boolean isPass(Macaron m) {
		if(m.getSize() < 8 || m.getSize() > 14) return false;
		if(m.getColor().equals("black")) return false;
		if(m.getThickness() < 3 || m.getThickness() > 18) return false;
		return true;
	}
	
}

class Macaron{
	
	private int size;
	private String color;
	private int thickness;
	
	public Macaron(int size, String color, int thickness) {
		super();
		this.size = size;
		this.color = color;
		this.thickness = thickness;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public int getThickness() {
		return thickness;
	}
	
	
	
}