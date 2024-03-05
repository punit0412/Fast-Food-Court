public class Burger extends ExtraItem {
    private ExtraItem extra1;
    private ExtraItem extra2;
    private ExtraItem extra3;

    public Burger(String name, double price){
        super(name,"Burger",price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice()) ;
    }

    public double getExtraPrice(String toppingName ){
        return switch (toppingName.toUpperCase()) {
            case "CHEESE","AVOCADO" -> 50;
            case "CHICKEN", "AALU TIKKI" -> 80;
            default -> 0;
        };
    }

    public void addToppings(String extra1,String extra2,String extra3){
        this.extra1 = new ExtraItem(extra1,"TOPPING",getExtraPrice(extra1));
        this.extra2 = new ExtraItem(extra2,"TOPPING",getExtraPrice(extra2));
        this.extra3 = new ExtraItem(extra3,"TOPPING",getExtraPrice(extra3));

    }


    public void printItemizedList(){
        printItem("BASE BURGER",getBasePrice());
        if (extra1 != null){
            extra1.printItem();
        }
        if (extra2 != null){
            extra2.printItem();
        }
        if (extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();

    }
}
