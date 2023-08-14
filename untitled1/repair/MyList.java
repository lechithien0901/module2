package repair;

import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size=0;
    public static final int DEFAULT_CAPACITY=10;
    private Object []elements=new Objects[DEFAULT_CAPACITY];
    MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void  add( E e){
        if (size== elements.length){
            ensureCapacity();
        }
         elements[size++]=e;

    }
    public E get(int i){
        if (i>= size||i<0){
            throw new IndexOutOfBoundsException("index : ban da sai roi "+ i +" size "+ i);
        }
        return (E) elements[i];
    }
}
