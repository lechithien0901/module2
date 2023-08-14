package demo1;

public class main {
    public static void main(String[] args) {
       Animal animal=new Bird();
       animal.sound();
        ((Bird)animal).fly();
        ((Bird)animal).sound();
        ((Flyable)animal).fly();

    }
}
