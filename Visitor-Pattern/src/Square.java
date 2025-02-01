public class Square implements Shape{
    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
