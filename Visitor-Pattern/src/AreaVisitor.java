public class AreaVisitor implements ShapeVisitor{
    @Override
    public void visit(Square square) {
        System.out.println("Area of square");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Area of circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Area of rectangle");
    }
}
