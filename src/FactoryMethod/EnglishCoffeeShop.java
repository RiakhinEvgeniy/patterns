package FactoryMethod;

public class EnglishCoffeeShop extends CoffeeShop {
    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case COFFEE_LATTE:
                coffee = new EnglishStyleCoffeeLatte();
                break;
            case CAPPUCCINO:
                coffee = new EnglishStyleCappuccino();
                break;
            case AMERICANO:
                coffee = new EnglishStyleAmericano();
                break;
            default:
                throw new RuntimeException("Don't this is coffee!");
        }

        return coffee;
    }
}
