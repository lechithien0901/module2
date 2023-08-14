package ss09_mvc.model;

public class Student {
    private int id;
    private String name;
    private int count;
    private double score;
    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name, int count, double score) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.score = score;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", score=" + score +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}
