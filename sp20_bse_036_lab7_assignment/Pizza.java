
package sp20_bse_036_lab7_assignment;
public class Pizza {
    private String pizza_size;
    private int chesse;
    private int pepperoni;
     private int ham;

      public Pizza() {
    }
     //Argumented constructor
    public Pizza(String pizza_size, int chesse, int pepperoni, int ham) {
        this.pizza_size = pizza_size;
        this.chesse = chesse;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }
// getter  and setters
    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }

    public String getPizza_size() {
        return pizza_size;
    }

    public void setChesse(int chesse) {
        this.chesse = chesse;
    }
    public int getChesse() {
        return chesse;
    }
    
    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getPepperoni() {
        return pepperoni;
    }
 
    public void setHam(int ham) {
        this.ham = ham;
    }

    public int getHam() {
        return ham;
    }
    
    //Method to show pizza prices
    public String price(){
        if (pizza_size=="small"){
            return  " Small Pizza price=10$";
        }
        else if(pizza_size=="medium"){
            return "Medium Pizza price=12$";
        }
        else if(pizza_size=="large"){
            return "Large Pizza price=14$";
        }
        else{
            return " ";
        }
    }
    
    //Method to calaculate pizza price with topping
    public double calcCost(){
     if(pizza_size=="small"){
         return  10+ (chesse+pepperoni+ham)*2;
     } 
     else if (pizza_size=="medium"){
         return 12+ (chesse+pepperoni+ham)*2;
    }
     else if(pizza_size=="large"){
         return 14+ (chesse+pepperoni+ham)*2;
     }
     else{
         return 0.0;
     }
    }
    public void getDescription(){
       System.out.println("--------Pizza Order----------");
       System.out.println("Pizza Size= "+ pizza_size +"\n"+ price()+"\n"+"Chesse topping= "+chesse +"\n"+
               "Pepperoni topping= "+ pepperoni +"\n"+ "Ham topping= "+ham+ "\n"+
               "Pizza Total Cost=$ "+calcCost());
       
    }
}