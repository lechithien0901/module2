package demo;

public class Teacher extends Person{
    private double salary;
    public Teacher(){}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}' +
                super.toString();
    }
}
