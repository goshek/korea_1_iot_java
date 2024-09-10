package chapter13;
/*
 	자바 제네릭
 	: 클래스나 메소드를 정의할 때 사용할 데이터 타입을 미리 지정하는 대신
 	>> 구체적인 사용 시 타입으로 대체
 	>> 특정 타입에 의존하지 않고 다양한 타입을 지원하는 클래스 또는 메소드 설계
 */

// class 클래스명<제네릭타입>
class Pair<k, V>{
	// (접근제어자) 반환타입 필드명;
	private k key;
	private V value;
	
	public Pair(k key, V value) {
		this.key= key;
		this.value= value;
	}
	
	public k getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	static <T> void print(T value) {
		System.out.println(value);
	}
}

/*
 === 제네릭 와일드 카드 ===
 : ?기호를 사용
 >> 제네릭 타입을 불특정하게 사용하도록 지정
 >> 주로 클래스간에 상속 관계인 경우 사용
 */
class Message<T>{
	private T message;

	public <T> Object getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Generic {
	public static void main(String[] args) {
		Pair<String, Integer> pair= new Pair<>("안녕하세요", 123);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		Pair.print(123);
		
		// == 와일드카드의 경우 타입에 대한 유연성을 제공
		Message<?> m1;
		Message<String> m2= null;
		
		m1= new Message<>();
		Object s= m1.getMessage();
		Boolean b=(Boolean)m1.getMessage();
		
		// cf) 제네릭의 한계
		// : 기본타입과 사용X
}





