package section12.access1;
// 추상클래스
public abstract class Game {

	public String title;
	public String genre;
	public int price;
	private int player;
	public String console;
	
	public abstract void setPlayer(int player);
	
	public int getPlayer() {
		return player;
	}
	
}
