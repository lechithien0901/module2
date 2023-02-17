package ss06_inheritance;

public class Circle1 {
     double radius=1;
    private String color="blue";
    public Circle1(){

    }
    public Circle1(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    @Override
    public String toString(){
        return "the Radius is : "
                +getRadius()
                +"the Circle has color is : "
                +getColor();
    }


}
