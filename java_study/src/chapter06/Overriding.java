package chapter06;

/*
 	=== 오버라이딩 ===
 	: 자식 클래스가 부모 클래스에서 정의된 메소드를 자신의 상황에 맞게 재정의
 	>> 상속 관계에 있는 클래스들 사이에서 사용
 	
 	1. 오버라이딩의 특징
 	- 메소드의 시그니처(선언부)가 일치
 	>> 부모 클래스에서 정의된 메소드와 동일한 이름, 매개변수 구성을 가져야 함
 	- 반환 타입은 같거나 자동 형 변환이 가능한 것이어야 함
 	- @override
 	: 오버라이딩 된 메소드임을 명시적으로 표시
 	
 	cf) 선언부
 	: 반환타입 메소드명(매개변수)
 	
 	2. 오버라이딩 구현 방법
 	- 부모 클래스의 상속받은 메소드를 자식 클래스에서 다시 정의
 	메소드의 이름, 매개변수를 일치, 반환타입은 같거나 형 변환 가능하게 작성
 	- 메소드 위에 @Override 어노테이션을 작성
 	
 	3. 오버라이딩을 사용하는 이유
 	- 다형성 구현
 	: 하나의 이름으로 여러 기능을 수행하는 코드 작성
 	- 재사용성 확장성 향상
 	: 기존 코드 변경 없이, 새로운 기능을 추가하거나 변경 가능
 */
class AnimalClass{
	void sound() {
		System.out.println("동물이 짖는다.");
	}
}

class DogClass extends AnimalClass{
	// void 메소드가 생략
	@Override
	// 현재 메소드가 부모 클래스의 메소드를 오버라이딩 한다는 것을 명시
	void sound() {
		System.out.println("개가 짖는다.");
	}
}
class CatClass extends AnimalClass{
	@Override
	void sound() {
		System.out.println("고양이가 짖는다.");
	}
}

public class Overriding {
	public static void main(String[] args) {
		DogClass dog1= new DogClass();
		dog1.sound();
		CatClass cat1= new CatClass();
		cat1.sound();
	}
	/*
	 == 오버라이딩 VS 오버로딩 ==
	 1) 오버로딩
	 - 같은 클래스 내에서 같은 이름을 가진 메소드를 여러개 정의
	 - 메소드명이 동일, 매개변수의 타입, 개수, 순서 중 적어도 하나 이상은 달라야 함
	 - 메소드의 동작을 다양한 상황에 맞게 조정
	 
	 2) 오버라이딩
	 - 상송 관계에 있는 클래스에서 사용
	 - 메소드의 시그니처가 같아야함
	 - 메소드의 동작을 변경하거나 확장
	 + @Override 어노테이션을 사용 >> 컴파일러에게 전달
	 */

}









