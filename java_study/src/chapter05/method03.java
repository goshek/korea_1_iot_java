package chapter05;

/*
 정적 메소드
 : 메소드 앞에 static 키워드를 붙여 클래스 메소드 생성
 */
class Operator{
	int a=3, b=5;
	int add() {return a+b;};
	int sub() {return a-b;};
	
	static int multiply(int a, int b) {return a*b;}
	static int div(int a, int b) {return a/b;}
	
}
public class method03 {
	public static void main(String[] args) {
		System.out.println();
		Operator op= new Operator();
		System.out.println(op.add());
	}
}
