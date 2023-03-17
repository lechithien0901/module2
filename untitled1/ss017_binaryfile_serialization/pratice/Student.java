package ss017_binaryfile_serialization.pratice;

import java.util.Scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;
    public Student(){}
    public Student(int id,String name,String address){
        this.address=address;
        this.id=id;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static void Write(String path, List<Student> students){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.flush();
            fileOutputStream.close();
            objectOutputStream.close();
        }catch (IOException e){
            e.getMessage();
            System.out.println("file not found");
        }
    }
    public static List<Student> Read(String path){
        List<Student> students=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            students=(List<Student>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.getMessage();
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner value=new java.util.Scanner(System.in);
        List<Student>students=new ArrayList<>();

            System.out.println("entry the link you want");
            String link = value.nextLine();
            students.add(new Student(1, "Lê Chí Thiện", "Đà Nẵng"));
            students.add(new Student(2, "Lê Chí Thanh", "Đà Nẵng"));
            students.add(new Student(3, "Lê Chí Hảo", "Đà Nẵng"));
            Write(link, students);
      List<Student>studentList=Read(link);
      for (Student student:studentList){
          System.out.println(student);
      }
    }
}
