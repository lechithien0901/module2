package demo1.repository;

import demo1.Model.Student;


public class StudentRepositoryImpl implements StudentRepository {
    private static Student[] student = new Student[10];
    private static int size = 0;

    static {
        student[0] = new Student(1, "le chi thien");
        student[1] = new Student(2, "le chi thanh");
        size = 2;
    }

    @Override
    public Student[] find() {
        Student[] student1 = new Student[size];
        for (int i = 0; i < student1.length; i++) {
            student1[i] = student[i];


        }
        return student1;

    }
        @Override
        public void addStudent (Student student2){
student[size]=student2;
size++;

        }

}