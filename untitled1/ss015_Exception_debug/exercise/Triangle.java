package ss015_Exception_debug.exercise;


import ss015_Exception_debug.exercise.IllegalTriangleException;

public class Triangle  {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b, double c)
            throws IllegalTriangleException{


       if (a<0||b<0||c<0){
           throw new IllegalTriangleException("the number you just entered is a negative number");
       }
       else if (a+b<c|a+c<b|b+c<a){
              throw new IllegalTriangleException("\n" +
                      "the sides you just entered are not the sides of the triangle");
       }


        this.a=a;

        this.b=b;
        this.c=c;

    }


}
