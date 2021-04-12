
package sp20_bse_036_lab7_assignment;

public class SP20_BSE_036_LAB7_Assignment {

    public static void main(String[] args) {
       System.out.println(":) Welcome to YUMMY PIZZA :)");
     //information about pizza
      Pizza P1= new Pizza("large",10,5,2);
      Pizza P2= new Pizza("medium",100,20,0);
      
      //ordering pizza 
       pizza_order O1= new pizza_order();
       O1.setPizzaNum(2);
       O1.setPizza3(P2);
       O1.setPizza1(P1);
       System.out.println("Total number of order: " +O1.getPizza_num());
       P1.getDescription();
       P2.getDescription();
       System.out.println("*********************"+"\nTotal order Cost= "+"$"+O1.calcTotal());        
    }
}
