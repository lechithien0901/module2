package ss04_class_and_objects_in_java;
import java.util.Scanner;
public class Fan {
    int speed=1;
    boolean on=false;
    double radius=5;
    String color="blue";
    String total="";

    public Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void turnOn(){
         this.on=true;
    }

    public String getTotal() {
                return total;
    }

    public void turnOff(){
        this.on=false;
    }

    public void setSpeed(int newSpeed) {
        if (on&&newSpeed>=1&&newSpeed<=3)
        this.speed = newSpeed;
        if (newSpeed==1){
            this.total="Slow";
        }
        else if (newSpeed==2){
            this.total="Medium";

        }else{
            this.total="Fast";
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String toString(){
        if (on){
            return getSpeed()+"-"+getTotal()+"-"+getColor()+"-"+getRadius()+":"+"fan is on";

        }
        else {
            return getSpeed()+"-"+getTotal()+"-"+getColor()+"-"+getRadius()+":"+"fan is off";
        }

    }


}