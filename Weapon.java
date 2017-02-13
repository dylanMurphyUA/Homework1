
public class Weapon extends Item {

		private int damage;
		public Weapon(String i, int j, int d) {
			super(i, j);
			damage = d;
			
		}
		public int getDamage(){
			return damage;
		}
		public void examine(){
			System.out.println();
			super.examine();
			System.out.printf("and deals %d damage", damage);
		}
}
	 


