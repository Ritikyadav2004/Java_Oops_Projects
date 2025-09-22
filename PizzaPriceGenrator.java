public class PizzaPriceGenrator {
    static class pizza {
        private int price;
        private boolean veg;

        private int extraCheese = 100;
        private int extraToppings = 150;
        private int takeAway = 20;
        private int basePizzaPrice;
        boolean isExtracheeseAdded=false;
        boolean isExtraTooping=false;
        boolean isOptedFortakeaway=false;

        // private boolean check;
        public pizza(boolean veg) {
            // this.check=false;
            this.veg = veg;
            if (this.veg) {
                this.price = 300;
            } else {
                this.price = 400;
            }
            this.basePizzaPrice=this.price;

        }

        public void addextraCheese() { // check=true;
            this.isExtracheeseAdded=true;
            // System.out.println("Extra Cheese Added");
            this.price += this.extraCheese;
        }

        
        public void addextraToppings() { // check=true;
            this.isExtraTooping=true;
            // System.out.println("Extra Toppings Added");
            this.price += this.extraToppings;
        }

        

        public void addtakeaway() {
            this.isOptedFortakeaway=true;
            // System.out.println("Take away opted");
            this.price = price + takeAway;
        }

        public void getBill() {
            String bill="";
            System.out.println("Pizza :"+basePizzaPrice);
            if(isExtraTooping)
            {
                bill+="Extra Topping Added :" +extraToppings+"\n";
            }

            if(isOptedFortakeaway)
            {
                bill+="Extra Topping Added :" +takeAway+"\n";
            }

            if(isExtracheeseAdded)
            {
                bill+="Extra Topping Added :" +extraCheese+"\n";
            }

            bill+="Bill "+this.price +'\n';
            System.out.println(bill);
            
        }

    }

static class DeluxPizza extends pizza
{
    public DeluxPizza(boolean veg)
    {
        super(veg);
        // bydefult rehte he 
        super.addextraCheese();
        super.addextraToppings();
    }
    //in this clss we ovverride this function as a do nothing function
    // sp that is user intemtionally want to add pizza pricw then he cannt
    @Override
    public void addextraCheese(){}

    @Override
    public void addextraToppings(){}


}
    public static void main(String[] args) {
        // pizza p1 = new pizza(true);
        // p1.addextraCheese();
        // p1.addextraToppings();
        // p1.addtakeaway();
        // p1.getBill();
        DeluxPizza dp = new DeluxPizza(false);
        dp.addextraCheese();
        dp.addextraToppings(); // not work
        dp.addtakeaway();
        dp.getBill();
    }

}
