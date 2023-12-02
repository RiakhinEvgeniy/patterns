package AbstractFactory;

public class WindowsGUIFactory implements GUIFactory {

    public WindowsGUIFactory() {
        System.out.println("Creating GUI factory for Windows OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating button for Windows OS");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating select for Windows OS");
        return new WindowsSelect();
    }

    @Override
    public TextField createField() {
        System.out.println("Creating text field for Windows OS");
        return new WindowsTextField();
    }
}
