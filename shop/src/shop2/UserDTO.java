package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;

//생성자, getter/setter, toString => 롬복 라이브러리 이용(롬복 라이브러리를 프로젝트에 포함시켜야한다)


@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class UserDTO {
	
	private int userId;
	private String name;
	private int payNo;
	
}
