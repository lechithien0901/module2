package ss05_access_modifier_static_method_in_java.com;

public class Circle {
    private double radius=1;
    private String color="red";
    Circle(){

    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public Double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius;
    }

}
