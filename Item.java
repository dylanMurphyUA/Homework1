/**This is code for Homework 1 in Data Structures
 * 
 */

/**
 * Dylan Murphy
 *
 */
public class Item {
 private String name;
 private int weight;
 public Item(String i, int j){
  name = i;
  weight = j;
 }
 public String getName(){
  return name;
 }
 public int getWeight(){
  return weight;
 }
 public void examine(){
	 System.out.printf("Your %s weighs %dton(s)", name, weight);
 }
 public static void main(String[] args) {
  
  Item items = new Item("book",1) ;
  
  System.out.println(items.getWeight());
  System.out.println(items.getName());
  items.examine();
  Weapon harm = new Weapon("Elder Sword", 100, 10000000);
  Armor steel = new Armor("Steel Garb(magic enhanced)", 200, 1000);
  Food yum = new Food("Banana", 1, 600, 12);
  
  harm.examine();
  
  steel.examine();
  
  yum.examine();
  yum.setQuantity(60);
  yum.getQuantity();
  yum.examine();
}
}




 
