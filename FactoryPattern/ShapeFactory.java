package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        if(input.equals("CIRCLE"))
            return new Circle();
        else if(input.equals("RECTANGLE"))
            return new Rectangle();
        else
            return null;
    }
}
