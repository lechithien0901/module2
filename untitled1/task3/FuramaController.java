package task3;

import java.util.Scanner;

public class FuramaController {
   private static EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    private static Scanner value=new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("1.Hiển thị danh sách sinh viên");
            System.out.println("2.Thêm nhân viên mới");
            System.out.println("3. Chỉnh sửa thông tin nhân viên");
            System.out.println("4.Thoát chương trình");
            System.out.println("Vui lòng chọn chức năng (1-4):");
            int choice=value.nextInt();
        switch (choice){
            case 1:
                displayEmployee();
                break;
            case 2:
                addEmployee();
                break;
            case 3:
                setEmployee();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("vui lòng chọn chỉ từ 1 đến 4");

        }

        }


        }
    public static void displayEmployee(){
       for(Employee employee: employeeService.getEmployees()){
           System.out.println(employee);
       }

    }
    public static void addEmployee(){

            System.out.println("nhập chức vụ vào đây ");
            String position = value.next();
            System.out.println("nhập tên vào đây");
            String name = value.next();
            Employee employee = new Employee(name, position);
            employeeService.addEmployee(employee);
        System.out.println("đã thêm nhân viên bạn mong cầu");


    }
    public static void setEmployee(){
        System.out.println("entry the id here");
        int id=value.nextInt();
        for (Employee employee: employeeService.getEmployees()){
            if (employee.getId()==id){
                System.out.println("nhập nhân viên mới vào đây ");
                String name=value.next();

                System.out.println("nhập chức vụ của người muốn nhận công việc tương ứng");
                String position=value.next();
                employee.setPosition(position);
                employee.setName(position);

            }
            employeeService.setEmployees(employee);
            System.out.println("cập nhật nhân viên đã thành công"+employee);
        }
    }
    }


