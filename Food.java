
public class Food extends Item {
	private int nutrition;
	private int quantity;
	public Food(String i, int j, int d, int q) {//new third parameter is for nutrition fourth is for quantity
		super(i, j);//Calls parent constructor, setting the name and weight
		nutrition = d;
		quantity = q;
		
	}
	public int getNutrition(){
		return nutrition;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int newQuant){
		quantity = newQuant;
			
	}
	public void examine(){
		System.out.println();//makes sure we're on the next line
		super.examine();//prints name and weight
		System.out.printf("and is a food that heals %d damage.  You have %d left.", nutrition, quantity);
	}
	
}
