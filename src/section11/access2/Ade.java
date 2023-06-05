package section11.access2;

public class Ade extends Drink{
	
	public String brand;
	public Ade() {
		name ="레몬에이드";
		volume = "350ml";
		type = "탄산";
		price = 1900;
		discountRate = 0.333;	
		brand = "썬키스트";
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("brand :" + brand);
	}
	
	public void taste() {
		System.out.println("레몬 맛");
	} 
}
