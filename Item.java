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
  
  Item items = new Item("masterSpear",300) ;
  
  System.out.println(items.getWeight());
  System.out.println(items.getName());
  items.examine();
    

}
}
 

 


 
