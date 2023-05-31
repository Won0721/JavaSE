package day7;

public class For {
	public static void main(String[] args) {
		
//		반복 횟수가 몇 번 인지 알 경우 for를 사용한다.
//		for가 실행되는 원리
//		1. 변수에 저장된 값으로 조건식을 실행해서 참이면 반복을 시작한다.
//		2. {} 블록을 한번 실행한 후 변수 값을 증감치 만큼 변경시키고 조건식을 실행해서 참이면 {} 블록을 반복하고 거짓이면 {}블록을 탈출한다.
//		for(자료형 변수명 = 초기값; 조건식; 증감식;) {
//			조건식이 참 인 경우 실행할 문장
//			...;
//		}		

//		변수를 선언만 하면 변수에 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기 전에 초기화를 시켜야 한다.
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
//			대입 연산자 : +=, -=, *=, /=, %=
//			sum = sum +i; 와 같은 기능
			sum += i;
		}
		System.out.println("1~100의 합계 : " + sum);
		
//		증감 연산자(++ : 1증가, -- : 1감소)
//		++A : 변수 A에 저장된 값을 1 증가 시키고 사용한다.
//		A++ : 변수 A에 저장된 값을 사용하고 1 증가시킨다. 현재 문장을 실행하고 ";" 만나서 문장이 종료되는 순간 실행
	
		int a = 1, b, c;
		b = a++;  // a를 b의 값에 대입함 . b = 1 ...  ";"를 만나서 문장 종료 및 a는 1 증가  a = 2
		c = ++a;   // a 값을 먼저 1증가 후 대입 a = 3 , c = 3
		System.out.println("a =" +a + " b ="+ b + " c =" + c);

		
//		() 안의 수식 산술 연산자(*, /, %) => 산술연산자 => (+, -) => 관계연산자 => 논리연산자 => 대입연산자
//		단항 연산자 => 이항 연산자 => 삼항 연산자	
		
		int d =1, e;
		e = ++d + ++d + ++d + ++d; // 5 + 4 + 3 + 2 = 14
		System.out.println("d =" + d + ", e = "+ e);
		
		
		
		
	}

}
