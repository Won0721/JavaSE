package section10;
/*
 * final 클래스
 *  클래스 앞에 final 키워드를 추가할 경우, 클래스 상속의 마지막 클래스임을 뜻한다.
 *  
 *  final 메소드
 *   메소드에 final 선언하면 해당 메소드는 하위 클래스에서 오버라이드 할 수 없다.
 */

import section10.access2.Jindo;

public class ExtendsClass04 {
	Jindo jindo = new Jindo();
	jindo.name = "백구";
	jindo.bark();

	

}
