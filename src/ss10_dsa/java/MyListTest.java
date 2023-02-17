package ss10_dsa.java;

public class MyListTest {
    public static void main(String[] args) {
        MyListOfMe<Integer>listInterget=new MyListOfMe<Integer>();
        listInterget.add(1);
        listInterget.add(2);
        listInterget.add(3);
        listInterget.add(4);
        listInterget.add(5);
        System.out.println(listInterget.get(3));
      listInterget.get(0);
        System.out.println(listInterget.get(0));

    }
}
