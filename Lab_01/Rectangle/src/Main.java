import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        Rectangle box = new Rectangle(x, y, width, height);
        box.translate(newX - box.x, newY - box.y);
        box.width *= 4;

        area = box.width * box.height;
        perimeter = box.width * 2 + box.height * 2;

        System.out.println(box);
        System.out.println(area);
        System.out.println(perimeter);

    }
}