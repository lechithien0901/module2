package repair;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
   private LinkedList<E>stack;
    public MyGenericStack(){
        stack=new LinkedList<E>();
    }
    public void push(E element){
        stack.addFirst(element);
    }
    public E pop(){
        if (stack.isEmpty()){
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
}
