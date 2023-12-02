package BridgePattern;

public class BridgeApp {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new WhiteColor());
        Shape rectangle = new Rectangle(new GreenColor());
        Shape circle = new Circle(new BlackColor());
        triangle.draw();
        rectangle.draw();
        circle.draw();
    }
}
