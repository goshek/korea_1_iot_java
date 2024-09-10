package chapter06;

/*
 상속
 : 한 클래스의 속성과 메소드를 다른 클래스가 물려받는 것
 - 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
 - 코드의 재사용성과 중복을 제거(프로그램의 생산성 향상)
 
  == 상속 구현 방법 ==
  : extends 키워드를 사용하여 구현(확장하다)
 */
class Parent{}
class Child extends Parent{}

class Animal{
	String name;
}
class Dog extends Animal{
	void bark() {
		System.out.println("왈왈");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.name="dd";
		d.bark();
	}

}
