package ss04_class_and_objects.pratice;

public class OuterClass {
    public static int isSum(int a,int b){
        return a+b;


    }
    int c;
    public  int isSout(){
        return OuterClass.isSum(10,3);
    }

    public static void main(String[] args) {
        OuterClass result=new OuterClass();
        int c=result.isSout();
        System.out.println(c);
    }

}
