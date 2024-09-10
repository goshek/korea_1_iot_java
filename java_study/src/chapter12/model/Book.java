package chapter12.model;

// 순수한 클래스(실행 main 메소드X)

// 책 객체를 정의하는 클래스
// : 제목, 저자, 출판사

public class Book {
	// 인스턴스 변수
	private String title;
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	private String author;
	private String publisher;
	
	@Override
	public String toString() {
		return "Title: "+ title + author + publisher ;
	}
	
	// 생성자
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
}
