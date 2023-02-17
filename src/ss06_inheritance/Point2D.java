package ss06_inheritance;

import java.lang.reflect.Array;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    float arr[]=new float[]{x,y};

     public Point2D(){}
    public Point2D(float x,float y){
         this.x=x;
         this.y=y;
    }
    public float getX(){
         return this.x;
    }
    public void setX(float x){
         this.x=x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
         this.x=x;
         this.y=y;
    }
    @Override
    public String toString(){
         return "the x is value : "+getX()
                 +" and "
                 +" the y is value : "+getY();
    }




    }

