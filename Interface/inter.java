package Interface;

interface Shape{
    int calculateArea();
    int calculatePerimeter();
}

class Rectangle implements Shape {
    int length;
    int width;

    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea(){
        return length * width;
    }

    @Override
    public int calculatePerimeter(){
        return 2 * (length + width);
    }
}
public class inter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());

        Shape rect = new Rectangle(10, 20);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
}
