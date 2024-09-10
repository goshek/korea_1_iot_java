package chapter13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
//@ToString
//@Getter
//@Setter
// >> @Data 어노테이션은 모든 멤버 필드에 대한 게터, 세터, toString, equals 메소드를 생성

@NoArgsConstructor
@AllArgsConstructor

public class Example {
	private String name;
	private int age;
	
// public Example(){};
}
