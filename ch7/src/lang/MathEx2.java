package lang;

//모든 메서드, 필드들이 static인 경우
import static java.lang.Math.*; // import 구문 자체를 static으로 처리
//이렇게 처리하면 Math 를 붙이지 않고 바로 메소드를 호출할 수 있음

public class MathEx2 {
	public static void main(String[] args) {
		//Math math = new Math; (x)
		
		System.out.println(E);
		System.out.println(PI);
		
		//반올림, 올림, 버림
		//round() : 반올림
		double val = 90.7552;
		System.out.println("round("+val+") = "+round(val));
		
		val *=100;
		System.out.println("round("+val+") = "+round(val));
		System.out.println("round("+val+")/100 = "+round(val)/100);
		System.out.println("round("+val+")/100.0 = "+round(val)/100.0);
		System.out.println();
		
		//printf에서 실수 출력 : %f / %3.1f : 출력 시 전체 자릿수는 3자리, 소수점은 첫째자리까지
		//ceil() : 올림
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.1,ceil(1.1));
		
		//floor() : 버림
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.5,floor(1.5));
		
		//max() : 더 큰 수
		System.out.printf("max(%d,%d) = %d",5,3,max(5, 3));
		//min() : 더 작은 수
		System.out.printf("min(%d,%d) = %d",5,3,min(5, 3));
	}

}
