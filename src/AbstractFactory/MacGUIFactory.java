package AbstractFactory;

public class MacGUIFactory implements GUIFactory {

    public MacGUIFactory() {
        System.out.println("Creating GUI factory for MAC OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating button for MAC OS");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating select for MAC OS");
        return new MacSelect();
    }

    @Override
    public TextField createField() {
        System.out.println("Creating text field for MAC OS");
        return new MacTextField();
    }
}
