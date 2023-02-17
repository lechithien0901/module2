package ss06_inheritance;
import ss07_abstract_class_and_interface_java.Colorable;
public class Circle extends Shape implements Colorable {
    private double radius=1.0;
public Circle(){

}
public Circle(double radius){
        this.radius=radius;

}
public Circle(double radius,String color,boolean filled){
    super(color,filled);
    this.radius=radius;


}
public double getRadius(){
    return this.radius;
}
public void setRadius(double newRadius){
    this.radius=newRadius;
}
public double getArea(){
    return radius*radius*Math.PI;
}
public double getPerimeter(){
    return 2*radius*Math.PI;
}
@Override
    public String toString(){
   return  "the radius is:"+getRadius()
   +"which is subclass of "+super.toString();
}
@Override
     public String howToColor(){
   return "Fill all the inside of the circle";
}

}