public class TestShape {
    public static void main(String[] args) {

        // Test Shape
        Shape s1 = new Shape();
        Shape s2 = new Shape("black", false);

        System.out.println("=== SHAPE ===");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s1 color = " + s1.getColor());
        System.out.println("s1 filled = " + s1.isFilled());

        s1.setColor("blue");
        s1.setFilled(false);

        System.out.println("s1 after setter:");
        System.out.println(s1);
        System.out.println();

        // Test Circle
        Circle c = new Circle(2.0, "red", true);

        System.out.println("=== CIRCLE ===");
        System.out.println(c);
        System.out.println("radius = " + c.getRadius());
        System.out.println("area = " + c.getArea());
        System.out.println("perimeter = " + c.getPerimeter());
        System.out.println("color = " + c.getColor());
        System.out.println("filled = " + c.isFilled());

        c.setRadius(4.0);
        System.out.println("radius after setter = " + c.getRadius());
        
        System.out.println();

        // Test Rectangle
        Rectangle r = new Rectangle(3.0, 4.0, "yellow", true);

        System.out.println("=== RECTANGLE ===");
        System.out.println(r);
        System.out.println("width = " + r.getWidth());
        System.out.println("length = " + r.getLength());
        System.out.println("area = " + r.getArea());
        System.out.println("perimeter = " + r.getPerimeter());
        System.out.println("color = " + r.getColor());
        System.out.println("filled = " + r.isFilled());

        r.setWidth(10.0);
        r.setLength(20.0);

        System.out.println("rectangle after setter:");
        System.out.println(r);
        System.out.println("area = " + r.getArea());
        System.out.println("perimeter = " + r.getPerimeter());

        System.out.println();

        // Test Square
        Square sq = new Square(5.0, "green", true);

        System.out.println("=== SQUARE ===");
        System.out.println(sq);
        System.out.println("side = " + sq.getSide());
        System.out.println("area = " + sq.getArea());
        System.out.println("perimeter = " + sq.getPerimeter());

        sq.setSide(6.0);

        System.out.println("after setSide(6):");
        System.out.println(sq);
        System.out.println("width = " + sq.getWidth());
        System.out.println("length = " + sq.getLength());
        System.out.println("side = " + sq.getSide());

        sq.setWidth(8.0);
        System.out.println("after setWidth(8):");
        System.out.println(sq);

        sq.setLength(3.0);
        System.out.println("after setLength(3):");
        System.out.println(sq);
        System.out.println("width = " + sq.getWidth());
        System.out.println("length = " + sq.getLength());
        System.out.println("area = " + sq.getArea());
        System.out.println("perimeter = " + sq.getPerimeter());
    }
}