package ss06_inheritance;

public class Cylinder extends Circle1 {
    private double height;
    Cylinder(){

    }
    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double newHeight){
        this.height=newHeight;
    }
    public double cylindricalVolume(){
        return this.height*Math.pow(this.radius,2)*Math.PI;
    }
    @Override
    public String toString(){
        return "the height of Cylinder is : "
                +getHeight()
                +" and "
                +" the cylindricalVolume is : "+cylindricalVolume()
                + ", which is a subclass of "

                +super.toString();

    }
}
