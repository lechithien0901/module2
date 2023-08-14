package ss7;

public interface Fly {
    void fly();
    default void showData2(){
        System.out.println("dsdsd");
    }
}
