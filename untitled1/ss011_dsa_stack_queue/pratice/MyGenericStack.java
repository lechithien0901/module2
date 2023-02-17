package ss011_dsa_stack_queue.pratice;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public  MyGenericStack(){
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
   public static  void stackOfIStrings(){
        MyGenericStack<String> stack=new MyGenericStack<String>();
        stack.push("Lê");
        stack.push("Chí");
        stack.push("Thiện");
        stack.push("12a12");
       System.out.println("1.1 Size of Stack after push operations : "+ stack.size());
       System.out.println("1.2 Pop the elements from Stack : ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
       System.out.println("Size of stack after pop operation : "+stack.size());
   }
public static void stackOfIntegers(){
        MyGenericStack<Integer> stack=new MyGenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    System.out.println("Size of Stack after push operations: " +stack.size());
    System.out.printf("2.2. Pop elements from stack : ");
    while (!stack.isEmpty()) {
        System.out.printf(" %d", stack.pop());
    }
    System.out.println("Size of Stack after pop operation"+stack.size());
}

}


