package ss06_inheritance;

public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape(){

    }
    public  Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean newFilled){
        this.filled=newFilled;

    }
    @Override
    public String toString(){
       return  "A Shape with color of "
               +getColor()
       +" and "
               +(isFilled()?"filled":" not filled");


    }
}