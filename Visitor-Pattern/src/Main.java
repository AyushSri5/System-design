import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Rectangle());

        AreaVisitor areaCalculator = new AreaVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }


    }
}