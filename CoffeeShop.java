public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();

        new Thread(new CoffeeMaker("Espresso", machine)).start();
        new Thread(new CoffeeMaker("Latte", machine)).start();
        new Thread(new CoffeeMaker("Mocha", machine)).start();

    }
}