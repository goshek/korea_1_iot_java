package chapter03;

public class A_Array {

	public static void main(String[] args) {
	    final int[] array= new int[3];
		/*
		 === 배열의 생성 ===
		 : 실제 데이터가 저장되는 것이 아니라 데이터 배열이 저장된 첫 번째 메모리 주소가 저장
		 >> new 데이터타입[배열의 길이];
		  */
	    System.out.println(array);
	    /*
	     a. 데이터타입[] 배열명= new 데이터 타입[] {요소1, 요소2, 요소3, ...};
	     b. 데이터타입[] 배열명= {요소, 요소2, 요소3, ...}
	     */
	    int scoreList[]= new int[] {90,75,95};
	    System.out.println(scoreList[0]);
	    
	    char greet[]= {'h','e','l','l','o'};
	    for(int i=0;i<greet.length;i++) {
	    	System.out.print(greet[i]);
	    }
	    System.out.println();
	    
	    /*
	     === 배열의 특징 ===
	     > 한 번 생성되면 크기 변경X
	     > 참조 타입: 주소값이 저장
	     > 모든 요소는 같은 자료형이어야 함
	     
	     ===문자열 배열 생성===
	     */
	    String[] fruits= new String[3];
	    System.out.println(fruits[0]);
	    
	    /*
	     === 배열의 삭제 ===
	     : 삭제 기능을 담당하는 문법X
	     >> 삭제할 요소를 제외한 나머지 요소를 새로운 배열로 복사
	     */
	    int original[]= {1, 2, 3, 4};
	    int removeIndex= 2; // 제거할 요소의 인덱스 번호
	    int originalLength= original.length;
	    
	    int[] result= new int[originalLength-1];
	    for(int i=0; i< originalLength; i+=1) {
	    	if(i== removeIndex) {
	    		continue;
	    	}
	    }
	}

}
