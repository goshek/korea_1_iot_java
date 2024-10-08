package chapter07;

/*
 	캡슐화
 	: 객체 지향 프로그래밍에서 데이터와 해당 데이터를 처리하는 함수를 하나라 묶는 것을 의미
 	- 객체 내부의 구현을 숨기고 외부에서는 제공된 메소드를 통해서만 접근할 수 있게 설정
 	>> 데이터 보호, 유지보수성 향상, 사용자 편의성 증대
 	
 	getter & setter 메소드
 	: 캡슐화된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능
 	
 	- getter: 객체의 특정 필드값을 읽는 메소드
 	- setter: 객체의 특정 필드 값을 설정하는 메소드
 */

// == 학생 정보를 관리하는 클래스 ==
class Student{
	private String name;
	private int age;
	private int score; //점수 필드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

public class C_Encapsulation {
	public static void main(String[] args) {
		// 인스턴스 생성
		Student student1= new Student();
//		student1.name= ""; error
		student1.setName("hyuck");
		System.out.println(student1.getName());
	}
}
