package FactoryMethod;

public class CoffeeShopApp {
    public static void main(String[] args) {

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        System.out.println("======================================");

        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.AMERICANO);

        System.out.println("=======================================");

        CoffeeShop englishCoffee = new EnglishCoffeeShop();
        englishCoffee.orderCoffee(CoffeeType.AMERICANO);
    }
}
