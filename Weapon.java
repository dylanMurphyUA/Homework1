
public class Weapon extends Item {

		private int damage;
		public Weapon(String i, int j, int d) {//new third parameter is for damage
			super(i, j);//Calls parent constructor, setting the name and weight
			damage = d;
			
		}
		public int getDamage(){
			return damage;
		}
		public void examine(){
			System.out.println();//makes sure we're on the next line
			super.examine();//prints name and weight
			System.out.printf("and deals %d damage", damage);
		}
}
	 


