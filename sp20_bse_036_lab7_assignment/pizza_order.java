
package sp20_bse_036_lab7_assignment;

public class pizza_order {
   private int  pizza_num;
   private Pizza pizza1;
   private Pizza pizza2;
   private Pizza pizza3;

    public pizza_order() {
    }

    public pizza_order(int pizza_num, Pizza pizza1, Pizza pizza2, Pizza pizza3) {
        this.pizza_num = pizza_num;
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }
    
    public void setPizzaNum(int pizza_num){
        if(pizza_num < 1)
			this.pizza_num = 1;
		else if(pizza_num > 3)
			this.pizza_num = 3;
		else
			this.pizza_num = pizza_num;
        
    }

    public int getPizza_num() {
        return pizza_num;
    }
    
    public void setPizza1(Pizza pizza1){
        if(pizza_num >= 1)
			this.pizza1 = pizza1;
		else
			this.pizza1 = null;
	  }
   public void setPizza2(Pizza pizza2){
        if(pizza_num >= 1)
			this.pizza2 = pizza2;
		else
			this.pizza2 = null;
	  }
    
    public void setPizza3(Pizza pizza3){
        if(pizza_num >= 1)
			this.pizza3 = pizza3;
		else
			this.pizza3 = null;
	  }
    
   public double calcTotal(){
       double total=0;
       if(pizza1 != null)
			total += pizza1.calcCost();
		
		if(pizza2 != null)
			total += pizza2.calcCost();
		
		if(pizza3 != null)
			total += pizza3.calcCost();
		
		return total;
       
   }       
}
