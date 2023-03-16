package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
		
		
		
		// String 생성자
		
		// new String(char value[])
		char c[]= {'H','E','L','L','O'};
		String str1 = new String(c);
		System.out.println(str1);
		
		//length
		System.out.println("length() : 문자열 길이 " + str1.length());
		
		// charAt(int index) : char => charAt 호출 시 int 매개변수를 넣어서 호출하고 결과값은 char 받는다
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));

		String str3 = "자바 프로그프래밍";
		//str3 문자열에 '프' 문자가 들어있는지 확인
		for (int i = 0; i < str3.length(); i++) {
			//==을 쓰는 이유는 char은 문자열이 아닌 문자이기 때문에 (""이 아닌 ''이기 때문에)
			//charAt도 '' 값을 가지기 때문에 ""로 찾을 수 없음
			if(str3.charAt(i) == '프') {
				System.out.println("프가 들어있음");
				break;
			}
		}
		int cnt = 0; //프 문자 갯수를 세는 변수
		for (int j = 0; j < str3.length(); j++) {
			if(str3.charAt(j) == '프') {
				cnt++;
			}
		}System.out.println(cnt);
		
		String str2 = "Hello";
		//indexOf(int ch) : 주어진 문자 ch가 문자열에 들어있는지 확인하고 위치를 리턴(못찾으면 -1 리턴)
		str2.indexOf('o');
		System.out.println("indexOf(int ch : "+str2.indexOf('o'));
		//indexOf(String str) : 문자열 찾기(찾으면 해당 문자열 시작 위치 출력)
		System.out.println("indexOf(String str) : "+str2.indexOf("o"));
		System.out.println("indexOf(String str) : "+str2.indexOf("llo"));
		//indexOf(int ch, int fromIndex) : int fromIndex위치부터 확인 시작
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e', 0)); //1
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e', 2)); //-1(못 찾음)
		
		//lastIndexOf() : 위치를 찾을 때 오른쪽 끝 부터 찾음
		System.out.println("lastIndexOf(int ch) : "+str2.lastIndexOf('o'));
		
		//str3 문자열에 '프'문자가 들어있는지 확인 : indexOf()
		System.out.println(str3.indexOf('프') > -1 ? "프가 들어있음":"프가 들어있지 않음");
		
		//subString() : 범위에 해당하는 문자열 얻기
		String ssn = "880515-1222012";
		//subString(int beginIndex)
		String result = ssn.substring(3);
		System.out.println(result);
		//subString(int beginIndex, int endIndex) : endIndex 자릿수는 미포함
		System.out.println("subString(int beginIndes, int endIndex : "+ssn.substring(3, 8)); //515-1
		
		//concat(String str) : + 와 같은 역할
		String result2 = str2.concat(" 안녕하세요");
		System.out.println(result2); // Hello 안녕하세요
		
		//startsWith(String prefix) : prefix로 시작하느냐?
		String str4 = "java.lang.Object";
		System.out.println(str4.startsWith("java.lang."));
		System.out.println(str4.startsWith("lang.Object", 5));
		
		//endsWith(String suffix) : suffix로 끝나느냐?
		System.out.println("endsWith(String suffix) : "+str4.endsWith("Object"));
		
		//contains() : 해당 문자열이 포함되었는지 검사 //indexOf는 위치값 리턴, contains는 true,false로 리턴
		System.out.println("contains(CharSequence s) : "+str4.contains("Hello"));
		
		//replace(원본문자열, 변경문자열)
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("풍부한", "다양한"));
		System.out.println(str5.replace("자바", "java"));
		System.out.println(str5); 
		//String은 변경불가이므로 원본을 바꾸려면 값을 다시 담아줘야한다
		str5 = str5.replace("자바", "java");
		System.out.println(str5);
		
		//replaceFirst(String regex, String replacement)
		str5.replaceFirst("java", "자바");
		
		//replaceAll(String regex, String replacement)
		str5.replaceAll("java", "자바");
		
		//공백도 문자다
		//trim() : 양쪽 공백 제거(중간 공백 제거 못함)
		String str6 = "   Hello World   ";
		System.out.println(str6);
		System.out.println(str6.length());
		System.out.println(str6.equals("Hello World"));
		System.out.println("trim() "+str6.trim());
		
		//static ==> 클래스이름.메소드명, 클래스이름.상수
		//(static String) valueOf() : 지정된 값을 문자열로 변환하여 리턴
		System.out.println(String.valueOf(true)); //==>"true"
		System.out.println(String.valueOf('c')); //==>"c"
		System.out.println(String.valueOf(100));//==>"100" 
		//==> Integer.parseInt("100") = 문자열을 숫자로 변환
		
		//a를 문자열로 변경
		int a = 100;
		String str7 = true+"";
		
		//toLowerCase() : 모든 문자열을 소문자로 변경
		// toUpperCase() : 모든 문자열을 대문자로 변경
		System.out.println(str2.toLowerCase()); // hello
		System.out.println(str2.toUpperCase()); // HELLO
		
		//split()
		String animals = "dog,cat,bear";
		//regex : Regular expression(정규 표현식) - 특정한 규칙을 가진 문자열의 집합
		String[] arr=animals.split(","); //,를 기준으로 나누기
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr)); //[dog, cat, bear]
		
		//for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//split(String regex, int limit) : regex를 기준으로 나누되, limit개의 그룹으로 나누기
		arr = animals.split(",", 2); //,를 기준으로 나누되, 2개의 그룹으로 나누기
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//compareTo(String str) : str(기준값)과 문자열 비교(사전순서)
		//같으면 0, 사전 순으로 이전이면 음수, 이후면 양수
		System.out.println("compareTo() : "+"aaa".compareTo("aaa")); // 0
		System.out.println("compareTo() : "+"aaa".compareTo("bbb")); // -1
		System.out.println("compareTo() : "+"bbb".compareTo("aaa")); // 1
		System.out.println("compareTo() : "+"aaa".compareTo("abc")); // -1
		
		//split() <==> join()
		//join() : 특정 문자열(구분자)로 결합
		arr=animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8 = String.join("-", arr);
		System.out.println(str8);
	}

}
