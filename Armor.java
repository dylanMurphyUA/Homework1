
public class Armor extends Item {
	private int defense;
	public Armor(String i, int j, int d) {
		super(i, j);
		defense = d;
		
	}
	public int getDamage(){
		return defense;
	}
	public void examine(){
		System.out.println();
		super.examine();
		System.out.printf("and has %d defense", defense);
	}

}
