package FactoryMethod;

public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {

        Coffee coffee = createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("This is your coffee!!! Come again!!!");

        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType coffeeType);
}
