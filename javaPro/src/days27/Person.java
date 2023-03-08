package days27;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 아래의 어노테이션은 lombok이라는 라이브러리를 설치 후 사용하는 어노테이션이다.
@Getter
@Setter
@AllArgsConstructor
@Data
public class Person {

	private String name;
	private int age;
	
	
}
