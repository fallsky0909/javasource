package lang;
/* 타입
 * 1) 기본형 : byte, short, int, long, float, double, boolean, char
 * 2) 참조형 : 배열, 클래스, 인터페이스
 * 
 * Wrapper 클래스
 * - 8개의 기본형을 객체로 다룰 때 사용
 */

public class WrapperEx1 {
	public static void main(String[] args) {
		// 정수형을 다룰 때 - 1) 기본형
		int a = 3;
		// a.메소드명 (x) (기본형이기 때문)
		
		char ch = 'a';
		byte b =4;
		float f = 4.15f;
		double d = 4.5;
		boolean b3 = true;
		long l = 123L;
		short s = 1;
		
		// 2) 참조형 : = 클래스(인터페이스) 만들어져있다 (메소드를 사용할 수 있다)
		//Integer i = new Integer(3); //Integer(int) has been deprecated since version 9
		// i.메소드명 (o) (참조형이기 때문)
		
		Integer i2 = 3;
		Integer i3 = 3;
		Character ch2 = 'a';
		Byte b2 = 4;
		Float f2 = 4.15f;
		Double d2 = 4.5;
		Boolean b4 = false;
		Long l2 = 123L;
		Short s2 = 1;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2==i3);
		
		System.out.println("문자형태의 숫자를 정수로 : " +Integer.parseInt("10"));
		System.out.println("문자형태의 숫자를 실수로 : " +Double.parseDouble("10.235"));
		//Float.parseFloat(""); Boolean.parseBoolean("true"); Long.parseLong("10")
		
		//기본형으로 선언된 변수를 참조형에 바로 담을 수 있다
		Integer i4 = a;
		

	}

}
