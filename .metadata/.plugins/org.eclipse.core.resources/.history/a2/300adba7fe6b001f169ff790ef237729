package chapter06;
class Car{
	String color;
	String gearType;
	int door;
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car(String color){
		this(color,"auto",4);
		door= 5;
	}
	// >> 객체 생성 시 색상만 작성하는 경우
	// >> 색상 +auto+ 문의 개수 5
	void displayInfo() {
		System.out.println(color +gearType+ door);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Car c= new Car("white");
		c.displayInfo();
		Car ca= new Car("black", "hand", 8);
		ca.displayInfo();
		
		/*
		 == 객체 지향 프로그래밍의 this==
		 1. this
		 >> 인스턴스 자신을 가리키는 참조 변수
		 >> 인스턴스의 주소값을 저장
		 : 모든 인스턴스 메소드에서 지역변수로 생략되어 존재
		 
		 2. this()
		 >> 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
		 */
	}

}
