public class Main {
    public static void main(String[] args) {
        OrderFood meal = new OrderFood("regular","coke","fries");
//        meal.printItemizedList();
        meal.addBurgerToppings("cheese","chicken","mayo");
        meal.printItemizedList();


    }
}