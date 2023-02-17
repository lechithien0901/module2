package ss05_access_modifier_static_method_in_java.com;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);

//        Student s1=new Student();
//        System.out.print("the Name you have to change name");
//        s1.setName("Le Chi THIEn");
//        System.out.println("the classes you have to change classes");
//        s1.setClasses("12a12");
//        System.out.println("the name is:"+s1.getName());
//        System.out.println("and classes is:"+s1.getClasses());
        System.out.println("enter the name you want ");
String a=value.nextLine();
        System.out.println("enter the classes you want");
        String b=value.nextLine();
        Student s1=new Student(a,b);
//        s1.setClasses(b);
//        s1.setName(a);
       System.out.print("you have to change name is:"+s1.getName());
        System.out.println();
       System.out.print("you have to change the layer is:"+s1.getClasses());

    }

}
