package section02;

import java.util.Scanner;

/*
 * Scanner 
 *  사용자로부터 데이터를 읽기 위해 사용되는 클래스
 *  Scanner 클래스를 사용하면 키보들로부터 텍스트나 숫자를 읽을 수 있다.
 * 
 * 
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		System.out.print("이름 :");
		name = sc.next();
		System.out.print("주소 :");
		address = sc.next();
		System.out.print("나이 :");
		age = sc.nextInt();
		System.out.print("체중 :");
		weight = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d입니다.\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n", weight);
		
		
		sc.close();
	}
	

}
