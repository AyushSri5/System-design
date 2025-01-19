public class Main {
    public static void main(String[] args) {
        ShapeInstanceFactory factoryObj=new ShapeInstanceFactory();
        Shape circleObj=factoryObj.ShapeInstanceFactory("Circle");
        circleObj.computeArea();
    }
}
