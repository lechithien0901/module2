package ss09_mvc.service;

import ss09_mvc.model.Student;

public interface IStudentService {
    Student[] findAll();
    void addStudent(Student student);
void fix();
void delete();

}
