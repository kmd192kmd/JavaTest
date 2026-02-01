package com.test.java.problemsolve;

public class Problem92 {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setTotalPages(1022);

		System.out.println(b1.info());
		
	}
}

class Book{
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private int yearOfPublication = 2019;
	private String isbn;
	private int totalPages;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title == null || title.trim().isEmpty()) {
			System.out.println("[경고] 제목은 비어있을 수 없습니다.");
		}
		if(title.length() > 50) {
			System.out.println("[경고] 제목이 너무 깁니다. (50자 이하)");
			return;
		}
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 1000000 || price < 0) {
			System.out.println("[경고] 유효하지 않은 가격 범위입니다.");
			return;
		}
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		if(isbn != null && isbn.matches("^[0-9-]+$")) {
			this.isbn = isbn;
		} else {
			System.out.println("[경고] ISBN은 숫자와 하이픈만 입력 가능합니다.");
		}
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		if(totalPages < 1) {
			System.out.println("[경고] 페이지 수는 최소 1이여야 합니다.");
			return;
		}
		this.totalPages = totalPages;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String info() {
		return String.format("제목: %s\n가격: %d원\n저자: %s\n출판사: %s\n발행년도: %d년\n"
				+ "ISBN: %s\n페이지: %,d장", title, price, author, publisher, yearOfPublication
				, isbn, totalPages);
	}
	
	
	
}