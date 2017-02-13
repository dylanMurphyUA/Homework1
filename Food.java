
public class Food extends Item {
	private int nutrition;
	private int quantity;
	public Food(String i, int j, int d, int q) {
		super(i, j);
		nutrition = d;
		quantity = q;
		
	}
	public int getNutrition(){
		return nutrition;
	}
	public int getQuantity(){
		return quantity;
	}
	public void examine(){
		System.out.println();
		super.examine();
		System.out.printf("and is a food that heals %d damage.  You have %d left.", nutrition, quantity);
	}
}
