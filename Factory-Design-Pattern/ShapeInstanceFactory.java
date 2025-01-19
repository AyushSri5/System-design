public class ShapeInstanceFactory {
    public Shape ShapeInstanceFactory(String s){
        if(s.equals("Circle")){
            return new Circle();
        }
        else if(s.equals("Square")){
            return new Square();
        }
        else if(s.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
