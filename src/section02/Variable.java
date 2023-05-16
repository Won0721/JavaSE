package section02;
/*
 * 변수(Variable)
 *  값을 저장하기 위한 메모리 공간을 의미.
 *  변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다.
 *  
 *  변수 선언 및 초기화 
 *   자료형 변수명 = 값;
 *   
 * 
 */
public class Variable {
	public static void main(String[] args) {
		// 정수형 변수 선언하고 값 대입하기
		int numInt = 10;
		// 실수형 변수 선언
		double numDouble = 10.1;
		// 문자열 변수 선언하고 값 대입하기
		String str = "Hello";
		
		System.out.println(numInt);
		System.out.println(numDouble);
		System.out.println(str);
	}
}
