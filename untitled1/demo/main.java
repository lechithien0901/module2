package demo;

public class main {
    public static void main(String[] args) {
        Person []people=new Person[2];
        people[0]=new Teacher(1,"le chi thien",13);
        people[1]=new Student(2,"le CHi thanh",12);

        Person person=new Student(2,"le CHi thanh",12);
        Person person2=new Teacher(1,"le chi thien",13);
        System.out.println(person);
        System.out.println(person2);
        if (person instanceof Student){
            System.out.println(((Student)person).getScore());

        }

        else {
            System.out.println(((Teacher)person).getSalary());
        }
    }
}
