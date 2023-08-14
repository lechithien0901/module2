package demo1;

public class Bird extends Animal implements Flyable{
    @Override
    public void sound(){
        System.out.println("chip chip");
    }

    @Override
    public void fly(){
        System.out.println("chim co the bay duoc");
    }
}
