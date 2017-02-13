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
 //-------------Constructor method that takes a string for name-------------------
 //----------------------------and an int for weight------------------------------
 public Item(String i, int j){
  name = i;
  weight = j;
 }
 //-------------------------------Get Methods-------------------------------------
 public String getName(){
  return name;
 }
 public int getWeight(){
  return weight;
 }
 //----------------------Examine Method explains what the item is,-----------------
 //----------------------gives relevent statistics and gives the name-------------- 
 public void examine(){
	 System.out.println();
	 System.out.printf("Your %s weighs %dton(s)", name, weight);
 }
 
 //Main Method that displays my dope programming skills
 public static void main(String[] args) {
  
  Item items = new Item("book",1) ;
  
  System.out.println(items.getWeight());
  System.out.println(items.getName());
  items.examine();
  Weapon harm = new Weapon("Elder Sword", 100, 10000000);//I made these items up :) Weight in tons
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




 
