package repair;

public class main {
    public static void main(String[] args) {
        MyList<Integer>ListInteger=new MyList<>();
        ListInteger.add(3);
        System.out.println(ListInteger.get(0));

        System.out.println("element -1: " + ListInteger.get(-1));
    }
}
