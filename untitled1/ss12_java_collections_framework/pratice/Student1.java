package ss12_java_collections_framework.pratice;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int age;
    private String address;
    public  Student1(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student1 student1){
        return this.getName().compareTo(student1.getName());

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
