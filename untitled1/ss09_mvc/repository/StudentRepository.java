package ss09_mvc.repository;

import ss09_mvc.model.Student;

import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    Scanner value = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int size = 0;

    static {
        students[0] = new Student(0, "le chi thien", 10, 9.5);
        students[1] = new Student(1, "le chi thanh", 10, 9.5);
        students[2] = new Student(2, "le chi hao", 10, 9.5);
        size = 3;
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    @Override
    public void fix() {
        System.out.println("Mời bạn nhập ID cần muốn sửa: ");
        int id = Integer.parseInt(value.nextLine());

        int choice;

        do {
            System.out.println("==================");
            System.out.println("1. Bạn muốn sửa tên");
            System.out.println("2. Bạn muốn sửa điểm");
            System.out.println("3. Bạn muốn sửa số lượng");
            System.out.println("==================");

            System.out.println("Mời bạn chọn chức năng: ");
            choice = Integer.parseInt(value.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập tên mới: ");
                    String newName = value.nextLine();
                    students[id].setName(newName);
                    for (int i = 0; i < getSize(); i++) {
                        System.out.println(students[i]);
                    }
                    break;

                case 2:
                    System.out.println("Mời bạn nhập điểm mới: ");
                    double newScore = Double.parseDouble(value.nextLine());
                    students[id].setScore(newScore);
                    for (int i = 0; i < getSize(); i++) {
                        System.out.println(students[i]);
                    }
                    break;

                case 3:
                    System.out.println("Mời bạn nhập số lượng mới: ");
                    int newCount = Integer.parseInt(value.nextLine());
                    students[id].setCount(newCount);
                    for (int i = 0; i < getSize(); i++) {
                        System.out.println(students[i]);
                    }
                    break;

                default:
                    System.out.println("Bạn đã chọn không có chức năng trong danh sách.");
                case 9:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 3);
    }

    @Override
    public void delete() {
        System.out.println("Mời bạn chọn vị trí muốn xóa: ");
        int position = Integer.parseInt(value.nextLine());

        for (int i = position; i < getSize() - 1; i++) {
            students[i] = students[i + 1];
        }

        size--;
    }
}