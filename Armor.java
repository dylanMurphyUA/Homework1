
public class Armor extends Item {
	private int defense;
	public Armor(String i, int j, int d) {
		super(i, j);//Calls parent constructor, setting the name and weight
		defense = d;
		
	}
	public int getDamage(){
		return defense;
	}
	public void examine(){
		System.out.println();//makes sure we're on the next line
		super.examine();//prints name and weight
		System.out.printf("and has %d defense", defense);
	}

}
