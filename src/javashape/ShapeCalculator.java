package javashape;

import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Rectangle rectangle = new Rectangle(a, b);
        rectangle.area();

    }
}
