package AbstractFactory;

public class OrderCoffeeForm {
    private final Button orderButton;
    private final Select coffeeTypeSelect;
    private final TextField customTextField;

    public OrderCoffeeForm(GUIFactory guiFactory) {

        System.out.println("Creating order coffee form");

        orderButton = guiFactory.createButton();
        coffeeTypeSelect = guiFactory.createSelect();
        customTextField = guiFactory.createField();
    }
}
