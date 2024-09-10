package chapter04;

class Card{
	// 인스턴스 변수: 각 카드마다 고유의 속성(개별 속성)
	// >> 일반 변수 선언과 동일
	int number;
	String kind;
	
	// 클래스 변수: 모든 카드가 공유할 데이터
	static int width= 100;
	static int height= 100;

}
public class z_ClassPractice {

	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		// 클래스 Card의 객체(인스턴스) 생성
		Card c1= new Card();
		c1.kind="spade";
		c1.number=7;
		
		System.out.println(c1.kind+ c1.number);
	}

}
