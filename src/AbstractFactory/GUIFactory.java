package AbstractFactory;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createField();
}
