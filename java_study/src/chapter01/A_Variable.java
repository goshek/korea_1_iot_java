package chapter01;

public class A_Variable {
	public static void main(String[] args) {
		/*
		변수(Variable)
		: 데이터를 저장할 수 있는 메모리 '공간'
		
		1. 변수 선언: 메모리 공간생성
		- 변수 선언 방법
		: 데이터 타입 변수명;
		- 변수 초기화 방법
		: 변수명= 데이터 값	; (= 할당의 뜻)
		- 변수 선언과 동시에 초기화
		: 데이터 타입 변수명= 데이터 값;
		- 변수 명명 규칙
		: 문자, 숫자, 기호를 사용
		- 대소문자 구분, 길이 제한이 없다.(Name !== name)
		- 숫자로 시작할 수 없음
		- 기호는 _ , $만 가능
		- lowerCamelCase를 사용
		- 자바의 예약어, 키워드는 변수명으로 사용할 수 없다.
		+) 전체 대문자 사용을 추천하지 않는다. why 상수와의 구분을 위해
		*/
		
		int num0= 10;
		char chr0= 'a';
		boolean bool0= true;
		
		/* 상수(Constant)
		 : 프로그램 실행 동안 그 값이 변경되지 않는 변수
		 >> 선언과 동시에 반드시 초기화가 이루어져야 함
		 
		 1. 상수 선언 방법
		 - final 키워드를 사용하여 상수 선언
		 - final 데이터타입 상수명= 데이터값;
		 
		 2. 상수 명명 규칙
		 - 보통 대문자로 명명
		 - UPPER_SNAKE_CASE 사용
		 EX) PI, RESIDENT_NUMBER등
		*/
		final float PI= 3.14159f;
		final int RESIDENT_NUMBER= 99011189;
		
	}
}











