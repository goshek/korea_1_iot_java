package chapter01;
public class B_DataType {
	public static void main(String[] args) {
		/*
		 데이터 타입(자료형, Data Type)
			: 자바는 강 타입 언어
		 모든 변수 선언 시 반드시 데이터 타입을 명시
		 
		 1. 데이터 타입 종류
		 : 기본 타입
		 >> 자바 변수 선언 시 해당되는 자료형의 크기 만큼 메모리 할당
		 >> 실질적인 데이터가 저장
		 
		 :참조 타입
		 >> 객체의 참조(메모리 주소)를 저장하는 변수 타입
		 
		 2. 기본 자료형
		 : 총 8가지의 기본형 타입
		 
		 byte, short, long, float,
		 int(4), double, char, boolean
		 
		 */
		int age= 30;
		int height= 177;
		// long 타입은 숫자 뒤에 알파벳 L, l을 사용하여 Long형임을 표시
		long bitNum= 10000000000L;
		System.out.println(age+","+ height);
		
		/*
		 문자형
		 char: 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
		 - 문자형의 데이터의 경우 따옴표를 사용해 감싸야 함
		 - 2Byte 
		 >> 단일 문자 저장
		 char grade= 'A';
		 char last_name='g';
		 
		 실수형: 소수점 자리가 있는 수
		 float: 4바이트 소수점, 숫자 뒤에 알파벳 F를 써서 float형임을 표시
		 double: 8바이트 수소점, 기본실수타입
		 */
		float weight0= 70.9f;
		double weight1= 35.12121212;
		
		/*
		 논리형: true, false
		 - 1바이트
		 - 소문자 값 사용을 권장
		 - 주로 is키워드를 사용하여 변수명 저장
		 */
		boolean isMarried= false;
		boolean isActivated= true;
		/*
		 참조 자료형
		 : 기본 자료형을 기초로 만들어진 자료형
		 >> 실제 데이터 값X, 데이터가 저장된 주소값을 가지는 자료형
		 
		 - 종류
		 >> String: 문자열을 저장하는데 사용
		 >> Array: 배열을 저장하는데 사용
		  */
		String name= "Gwon";
		int[] scores= {90, 80, 85, 97};
	}
}
