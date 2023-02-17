package ss011_dsa_stack_queue.pratice;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack stack1=new MyGenericStack();
        System.out.println("1. Stack of integers");

       stack1.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stack1.stackOfIStrings();
    }
}
