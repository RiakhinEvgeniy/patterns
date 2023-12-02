package AbstractFactory;

public class LinuxGuiFactory implements GUIFactory {

    public LinuxGuiFactory() {
        System.out.println("Creating GUI for Linux OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating button for Linux OS");
        return new LinuxButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating select for Linux OS");
        return new LinuxSelect();
    }

    @Override
    public TextField createField() {
        System.out.println("Creating text field for Linux OS");
        return new LinuxTextField();
    }
}
