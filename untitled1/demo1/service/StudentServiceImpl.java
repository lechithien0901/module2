package demo1.service;
import demo1.Model.Student;

import demo1.repository.StudentRepository;
import demo1.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository=new StudentRepositoryImpl();
    @Override
   public Student[] find(){
        return studentRepository.find();
    }

    @Override
    public void addStudent( Student student) {

    }
}