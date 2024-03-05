public class OrderFood {
    private ExtraItem side;
    private ExtraItem drink;
    private Burger burger;

    public OrderFood(){
        this("regular","coke","fries");
    }
    public OrderFood(String burgerType,String drinkType,String sideType){
        this.burger = new Burger(burgerType,60);
        this.drink = new ExtraItem(drinkType,"Drink",40);
        this.side = new ExtraItem(sideType,"side",40);
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();

    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        ExtraItem.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1,String extra2,String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

}



