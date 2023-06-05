package section11;

import section11.access2.Ade;
import section11.access2.Drink;
import section11.access2.IonicDrink;

public class Polymorphsim03 {
	public static void main(String[] args) {
		int selectNum = Integer.parseInt(args[0]);
		
		Drink drink = selectDrink(selectNum);
		
		
	}
	
	/**
	 *  음료선택 메소드
	 *  1: Ade
	 *  2: 이온음료
	 */
	// 메인에서 호출해야하기에 static
	public static Drink selectDrink(int selectNum) {
		Drink drink;
		if(selectNum ==1) {
			drink = new Ade();
		} else {
			drink = new IonicDrink();
		}
		
		return drink;
	}

	
}
