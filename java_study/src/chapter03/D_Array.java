package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {

	public static void main(String[] args) {
		/*
		 자바의 기본 배열 형태
		 : 한 번 생성되면 크기 변경 X
		 >> 변경시 새로운 배열 생성하여 원래 배열 요소를 복사
		 */
		int numbers[]= new int[5];
		System.out.println(Arrays.toString(numbers));
		
		/*
		 == 동적 배열 사용법==
		 : ArrayList 라이브러리의 기능
		 : java.utils.arrayList를 import해서 사용
		 
		  cf) 동적 배열의 경우 배열의 타입 지정 시 일반 데이터 타입X, 참조 타입으로 작성
		  int >> Integer
		  char >> Charactor
		  boolean >> Boolean
		  String
		  
		  +) 참조 타입은 기본값이 모두 null
		  [null, null, null, ...]
		  +) 기본 타입은 null 값을 가질 수 없다 >> int a= null;
		 */
		Integer a= 123;
		System.out.println(a);
		
		// == ArrayList 생성==
		// ArrayList<데이터타입> 배열명= new ArrayList<>(선택);
		ArrayList<Integer> arrayList= new ArrayList<>(5);
		System.out.println(arrayList);
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		
		// ==ArrayList 데이터 변경==
		arrayList.set(1, 50);
		System.out.println(arrayList); //10, 50, 30
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2,100);
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
	}

}










