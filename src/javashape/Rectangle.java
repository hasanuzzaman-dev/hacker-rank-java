package javashape;

public class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(length * breadth);
    }
}
