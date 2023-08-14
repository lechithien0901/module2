package demo1.Controller;

import demo1.Model.Student;
import demo1.service.StudentService;
import demo1.service.StudentServiceImpl;

import java.util.Scanner;




public class StudentController {


   private static StudentService service=new StudentServiceImpl();


    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);

        int choice=0;
        do{
            System.out.print("=====================================");

            System.out.print("    1.xem hoc sinh         ");
            System.out.print("    2.them hoc sinh        ");
            System.out.print("    3.thoat chuong trinh   ");
            System.out.print("=====================================");
            choice=Integer.parseInt(value.nextLine());
            switch (choice){
                case 1:
                    Student[] student=service.find();
                    for (Student student1:student)
                        System.out.println(student1);
                    break;
                case 2:
            }


        }while(true);


    }


}
