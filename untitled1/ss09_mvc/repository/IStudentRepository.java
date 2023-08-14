package ss09_mvc.repository;

import ss09_mvc.model.Student;

public interface IStudentRepository {
    Student []findAll();
    int getSize();
    void addStudent(Student student);
 void fix();
 void delete();
}
