package ss07_abstract_class_and_interface_java;

import ss07_abstract_class_and_interface_java.resizeable.Resizeable;

public class Circle extends ss06_inheritance.Circle implements Resizeable {
    private  double radius=1.0;

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;

}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double resize(double percent){
        return percent*3.6;
    }




}