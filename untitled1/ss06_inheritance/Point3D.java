package ss06_inheritance;

public class Point3D extends Point2D {
     float z=0.0f;
    public Point3D (){

    }
    public Point3D(float z){
        this.z=z;
    }
    public Point3D(float z,float x,float y){
        super(x,y);
        this.z=z;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public float getY() {
        return super.getY();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    @Override
    public String toString(){
        return "the z has value is "+getZ()
                +" and " +

        super.toString();
    }
}
