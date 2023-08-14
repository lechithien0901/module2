package demo1.Model;

public class Student {
    private int id;
    private String name;
    public Student(){}
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id=id;
    }

}
