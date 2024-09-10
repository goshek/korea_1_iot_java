package chapter12.view;
import java.util.List;
import java.util.Scanner;
import chapter12.controller.BookController;
import chapter12.model.Book;

public class BookView {
	private Scanner sc;
	private BookController bookController;
	
	public BookView() {
		this.sc= new Scanner(System.in);
		bookController= new BookController();
	}
	
	// 사용자에게 메뉴를 표시하고 입력을 처리하는 메소드
	public void showMenu() {
		int choice= 0;
		while(choice != 4) {
			// 책 추가, 모든 책 조회, 책 검색, 서비스 중단
			System.out.println(" 1. Add a Book");
			System.out.println(" 2. Show all Books");
			System.out.println(" 3. Search for a book");
			System.out.println(" 4. Quit");
			System.out.println("메뉴를 선택해주세요: ");
			
			choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				addBookView();
				break;
			case 2:
				showAllView();
				break;
			case 3:
				searchBookView();
				break;
			default:
				System.out.println("종료");
				break;
			}
		}
	}
	private void addBookView() {
		System.out.println("책의 제목을 입력해주세요.");
		String title= sc.nextLine();
		
		System.out.println("책의 저자를 입력해주세요.");
		String author= sc.nextLine();
		
		System.out.println("책의 출판사를 입력해주세요.");
		String publisher= sc.nextLine();
		
		bookController.addBook(title, author, publisher);
	}
	private void showAllView() {
		List<Book> allBooks= bookController.getAllBooks();
		for(Book book:allBooks) {
			System.out.println(book.toString());
		}
	}
	private void searchBookView() {
		System.out.println("책을 검색해주세요: ");
		String title= sc.nextLine();
		List<Book> foundBooks= bookController.searchBook(title);
		for(Book book: foundBooks) {
			System.out.println(book.toString());
		}
	}
}








