package ss09_mvc.service;

import ss09_mvc.model.Student;
import ss09_mvc.repository.IStudentRepository;
import ss09_mvc.repository.StudentRepository;

public class StudentService implements IStudentService {
    IStudentRepository repository = new StudentRepository();

    @Override
    public Student[] findAll() {
        Student[] students = repository.findAll();
        for (int i = 0; i < repository.getSize(); i++) {
            System.out.println("hoc sinh thu " + (i + 1));
            System.out.println(students[i]);

        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }

@Override
    public void fix(){
        repository.fix();
}
@Override
    public void delete(){
        repository.delete();
}
}
