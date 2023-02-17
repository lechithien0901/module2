package ss06_inheritance;
import ss07_abstract_class_and_interface_java.Colorable;

public class Rectangle extends Shape implements Colorable{
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public  double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        return  width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    @Override
    public String toString(){
        return  "the width is : "+getWidth()
                +"the length is : "+getLength()
                +super.toString();
    }
    @Override
    public String howToColor(){
        return "fill \n" +
                "to side in the side of the rectangle, be careful when accessing the side because it can smudge";
    }

}
