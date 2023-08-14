package demo1.repository;

import demo1.Model.Student;

public interface StudentRepository {
    Student[] find();
    void addStudent(Student student);

}
