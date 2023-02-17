package ss10_dsa.java;

import java.util.Arrays;

public class MyListOfMe<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements [];
    public MyListOfMe() {   
        elements = new Object[DEFAULT_CAPACITY] ;
    }
    private void ensureCapa(){
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size==elements.length){
            ensureCapa();

        }
        elements[size++]=e;
    }
    public E get(int i){
        if(i<0||i>=size){
            throw new IndexOutOfBoundsException("index "+ i +" size "+ i);
        }
        else {
            return (E) elements[i];
        }
    }
}
