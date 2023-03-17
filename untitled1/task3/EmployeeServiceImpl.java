package task3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl {
   static List<Employee>employees=new ArrayList<>();
    static {
        employees.add(new Employee(1,"thien","police"));
        employees.add(new Employee(2,"thanh","\n" +
                "businessmen"));

    }
    public List<Employee> getEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public  void setEmployees(Employee employee) {
       for (Employee e:employees){
           if (e.getId()==employee.getId()){
               e.setName(employee.getName());
               e.setPosition(employee.getPosition());
break;
           }
       }
    }
}
