package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphsim02 {
	public static void main(String[] args) {
		/*
		 * 1번 Car 클래스 drive() - 운전을 합니다.
		 * 2번 Bus 클래스 drive() - 승객을 태우고 운전 합니다.
		 * 3번 SchoolBus 클래스 drive() - 학생을 태우고 운전을 합니다.
		 */
		SchoolBus sb1 = new SchoolBus();
		sb1.drive(); // 3번
		// 주소값 찍기
		System.out.println(System.identityHashCode(sb1));
		
		Car c1 = sb1; // new SchoolBus의 주소값을 대입했기때메 3번
		c1.drive();
		
		System.out.println(System.identityHashCode(c1));
		Bus b1 = (Bus) c1; // 상위클래스에서 하위클래스로 대입 할때 강제형변환 해야함
		b1.drive();
		
		System.out.println(System.identityHashCode(b1));
		
		System.out.println("sb1.color :" + sb1.color);
		System.out.println("c1.color :" + c1.color);
		System.out.println("b1.color :" + b1.color);
		
		c1.color ="Red";
		// 같은 주소를 바라보고 있기 때문에 모두 값 바뀜
		System.out.println("sb1.color :" + sb1.color);
		System.out.println("c1.color :" + c1.color);
		System.out.println("b1.color :" + b1.color);
	}

}
