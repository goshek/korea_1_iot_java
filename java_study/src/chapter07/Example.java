package chapter07;

public class Example {
	// 클래스의 속성
	
	// 어디서든 접근 가능
	public int publicvar= 1;
	// 같은 패키지 O, 다른 패키지- 해당 클래스를 상속받은 자식 클래스만 접근 가능
	protected int protectedVar= 2;
	// 같은 패키지 O, 다른 패키지 사용X (default)
	int defaultVar= 3;
	// 같은 클래스 내에서만 접근가능
	private int privateVar= 4;
	
	//클래스의 메소드
	public void ex1() {
		System.out.println(publicvar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}
	
	protected void ex2() {
		System.out.println(protectedVar);
	}
	void ex3() {
		System.out.println(defaultVar);
	}
	private void ex4() {
		System.out.println(privateVar);
	}
}
