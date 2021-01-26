package polymorphism;

public class FindAccess {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figure;
        figure = rectangle;
        System.out.println("Ուղղանկյան մակերեսը հավասար է " + figure.area());
        figure = triangle;
        System.out.println("Եռանկյան մակերեսը հավասար է " + figure.area());
    }
}

