package ss7;

public class Bird extends Animal implements Fly{
    @Override
    void Tiengkeu() {
        super.Tiengkeu();
    }



    @Override
    public void fly() {
        System.out.println("ladfadfas");

    }

    @Override
    public void showData2() {
        Fly.super.showData2();
    }
}
