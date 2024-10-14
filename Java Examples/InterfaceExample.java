interface Drawable {
    void draw();
}

interface Movable {
    void moveTo(int x, int y);
}

class Circle implements Drawable, Movable {
    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override 
    public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override 
    public void moveTo(int x, int y) {
        System.out.println("Circle has been moved to x = " + x + " and y = " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.draw();
        circle.moveTo(2, 4);
    }
}
