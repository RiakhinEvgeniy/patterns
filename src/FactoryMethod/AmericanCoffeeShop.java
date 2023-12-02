package FactoryMethod;

public class AmericanCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO:
                coffee = new AmericaStyleAmericano();
                break;
            case CAPPUCCINO:
                coffee = new AmericaStyleCappuccino();
                break;
            case COFFEE_LATTE:
                coffee = new AmericaStyleCoffeeLatte();
                break;
            default:
                throw new RuntimeException("Don't this is coffee!");
        }
        return coffee;
    }
}
