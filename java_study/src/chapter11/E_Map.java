package chapter11;

import java.util.HashMap;
import java.util.Map;

/*
 	Map인터페이스
 	키와 값의 쌍으로 요소를 저장하는 데이터 구조
 	- 키는 고유한 데이터를 가짐
 	
 	== Map의 주요 특징 ==
 	: 키의 유일성
 	: 값의 중복성
 	>> 순서보장X (LinkedHashMap은 순서 보장O)
 	
 	1. HashMap
 	: 해시 테이블을 사용하여 키-값 쌍을 저장
 	>> 순서 유지X(작업 시간빠름)
 	>> null허용(키, 값 모두 허용)
 	
 	2. LinkedHashMap
 	:삽입 순서를 유지
 	
 	3. TreeMap
 */
public class E_Map {

	public static void main(String[] args) {
		Map<String, Integer> students= new HashMap<String, Integer>();
		
		students.put("gwon", 20);
		students.put("kwon", 22);
		students.put("hyuck", 22);
	}

}
