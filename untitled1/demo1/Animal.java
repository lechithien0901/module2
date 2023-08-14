package demo1;

public  abstract class Animal {
    private String name;
    private int id;
    public  abstract void sound();
    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }
}
