package demo;

public class Student extends  Person {
    private int score;
    public Student(){}

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}'
                +super.toString();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(int id, String name, int score) {
        super(id, name);
        this.score = score;
    }
}
