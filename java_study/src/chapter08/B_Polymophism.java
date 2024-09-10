package chapter08;

/*
 	다형성
 	: 많은 형태를 가질 수 있는 능력
 	>> 하나의 객체가 여러 타입의 인스턴스로 취급 될 수 있는 특성
 	>> 상속 + 메소드 오버라이딩 + 클래스 타입 변환
 	
 	instance of 연산
 	: 참조변수감ㅅ instanceof 타입(클래스명)
 	>> 해당 객체가 특정 클래스의 인스턴스인지 또는 그 클래스를 상속받은
 	자식 클래스의 인스턴스인지를 확인
 */

class Vehicle{
	void display() {
		System.out.println("운송수단입니다.");
	}
}

class Bus extends Vehicle{
	@Override
	void display() {
		System.out.println("버스를 타고갑니다.");
	}
}

class Subway extends Vehicle{
	@Override
	void display() {
		System.out.println("지하철을 타고갑니다.");
	}
}


public class B_Polymophism {

	public static void main(String[] args) {
		/*
		 	다형성 적용
		 	: 부모 클래스 타입의 참조 변수로 자식 클래스 객체를 참조
		 */
		Vehicle myVehicle= new Vehicle();
		Vehicle myBus= new Bus();
		Vehicle mySubway= new Subway();
		
		if (myBus instanceof Vehicle) {
			myBus.display();
		}
	}

}










