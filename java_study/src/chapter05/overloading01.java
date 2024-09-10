package chapter05;

public class overloading01 {
	/*
	 메소드 오버로딩
	 : overloading
	 한 클래스 내에 같은 이름의 메소드를 여러 개 정의하는 것
	 
	  1. 오버로딩의 성립 조건
	  - 메소드 이름이 같아야 함
	  - 매개변수의 개수 또는 타입이 달라야 함.
	  - 반환 타입은 관계 없음
	  
	  2. 오버로딩의 장점
	  - 사용자가 매개변수의 순서를 외우지 않아도 사용 가능(편의성)
	  
	  3. 오버로딩의 단점
	  - 중복적으로 의미 없이 생성하는 경우, 실질적으로 필요한 구현 메소드 찾기에 어려움(복잡성)
	 */
	class Cal{
		static int add(int aa, int bb) {return aa+bb;}
		//long add(int aa, int bb){return aa+bb;} -error
		
		static double add(double aa, double bb) {return aa+aa+bb;}
		static double add(int aa, double bb) {return aa+bb+bb;}
		static double add(double aa, int bb) {return aa+bb+aa+bb;}
		
		static int add(int aa, int bb, int cc) {return aa+cc;}
		/*
		 cf) 오버로딩 사용 이유
		 1. 메소드가 수행하는 기본적인 작업이 동일할 때, 같은 이름 사용 가능
		 - 코드가 더 명확하고 가독성 있게 작성 가능
		 2. 코드의 재사용성이 높아짐
		 3. 컴파일 시 타입 체크를 강화- 올바른 매개변수 타입을 가진 메소드를 선택
		 */
	}
	public static void main(String[] args) {
		System.out.println(Cal.add(3, 5, 8));
		System.out.println(Cal.add(3, 5.1));
		System.out.println(Cal.add(3.7, 5.8));
	}

}
