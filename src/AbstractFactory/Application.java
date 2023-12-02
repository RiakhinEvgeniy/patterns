package AbstractFactory;

public class Application {

    private OrderCoffeeForm form;

    public void drawOrderCoffeeForm() {

        String osName = "Mac";
        GUIFactory guiFactory;

        if (osName.toLowerCase().startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        }
        else if (osName.toLowerCase().startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        }
        else if (osName.toLowerCase().startsWith("lin")) {
            guiFactory = new LinuxGuiFactory();
        }
        else {
            System.out.println("Unknown OS, can't draw form :(");
            return;
        }
        form = new OrderCoffeeForm(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderCoffeeForm();
    }
}
