package ss06_inheritances.exercise;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập bán kính của bạn vào đây");
       int isValue= scanner.nextInt();
        Circle.setRadius(isValue);
        System.out.println("mời bạn nhập chiều cao");
        int isValue1=scanner.nextInt();
        Cylinder.setHeight(isValue1);
        Circle circle=new Circle();
        Cylinder cylinder=new Cylinder();
        System.out.println(circle);
        System.out.println(cylinder);

    }
}
