package ss09_mvc.controller;

import ss09_mvc.model.Student;
import ss09_mvc.service.IStudentService;
import ss09_mvc.service.StudentService;

import java.util.Scanner;

public class StudentController {
    IStudentService service=new StudentService();
    Scanner value=new Scanner(System.in);
    public void display(){
    int chose;
    do{
        System.out.println("======The menu======");
        System.out.println("1.the list");
        System.out.println("2.add Student");
        System.out.println("3.sua");
        System.out.println("4.xoa");
        System.out.println("moi ban nhap chuc nang ");
        chose=Integer.parseInt(value.nextLine());
        switch (chose){
            case 1:service.findAll();
            break;
            case 2:
                System.out.println("moi nhap id");
                int id=Integer.parseInt(value.nextLine());
                System.out.println("moi nhap ten");
                String name= value.nextLine();
                System.out.println("moi nhap");
                int count=Integer.parseInt(value.nextLine());
                System.out.println("moi nhap diem");
                double score=Double.parseDouble(value.nextLine());
                service.addStudent( new Student(id,name,count,score));
                break;
            case 3:
              service.fix();
              break;
            case 4:
        service.delete();
        break;
        }



    }while(chose>=1&&chose<=4);
}
}
