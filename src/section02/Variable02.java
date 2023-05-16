package section02;
/*
 * 2. 문자형(char)
 *  문자 한 글자 저장 가능 - 전세계 쓰이는 대부분의 문자 표현가능!
 *  2byte 
 * 
 *  선언방법
 *  	char 변수명;
 *  
 *  변수 초기화
 *  	변수를 사용하기전에 값을 할당하는 것을 의미한다.
 */
public class Variable02 {
	public static void main(String[] args) {
		// char 형 변수 선언 과 동ㅅ에 값 대입하기(초기화 라고 부르기도함)
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자: "+ ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '뛁';
	
		
		System.out.println("ch2 :" + ch2);
		System.out.println("ch3 :" + ch3);
		
		int num = ch1; // char 형을 int 정수형으로 형변환
		System.out.println(num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자코드:" + ch4);
		
		int num2 = 110;
		char ch5 = (char)num2; // int 형을 char 형으로 강제형변환 
		System.out.println(ch5);
	}

}
