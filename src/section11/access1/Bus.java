package section11.access1;

public class Bus extends Car{
	
	public Bus() {
		type = "버스";
		color = "Green";
	}
	public void drive() {
		System.out.println("승객을 태우고 운전합니다.");
	}

}
