public class ExtraItem {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public ExtraItem(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (name.equals("SIDE") || name.equals("DRINKS")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size) {
            case "SMALL" -> getBasePrice() - 20;
            case "LARGE" -> getBasePrice() + 20;
            default -> getBasePrice();
        };
    }

    public void setSize(String size){
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s: %6.2f%n",name,price);
    }

    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }

}
