package ss10_dsa.java;





 import  java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Objects;
 import java.util.function.Consumer;
 import java.util.function.Predicate;
 import java.util.function.UnaryOperator;

public class MyList<E> {
    private int size = 0;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    protected transient int modCount = 0;
    static final int DEFAULT_CAPACITY = 10;
    public static final int SOFT_MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
    private Object elements[];
    transient Object[] elementData;
    E[] data = (E[]) new Object[DEFAULT_CAPACITY];
    public MyList(){

    }

    MyList(int capacity){

    }
    public void add(int index,E element){
        ensureCapacity();
        for (int i=size-1;i>=index;i--) {
            data[i + 1] = data[i];
        }
        data[index]=element;
        size++;
    }
    private void ensureCapacity(){
        if ((size >= data.length)) {
            E[]newData=(E[])(new Object[size*2+1]);

            System.arraycopy(data, 0, newData, 0, size);
            data = newData;


        }
    }
    public int size(){
        return size;
    }
    public Object clone() {
     try{
         MyList<E>v=(MyList<E>)super.clone();
         v.data= Arrays.copyOf(data,size);
         v.modCount=0;
         return v;
     }catch (CloneNotSupportedException e){
         throw new InternalError(e);
     }
    }
    public boolean contains(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(data[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }
    E elementData(int index){
        return (E)data[index];
    }
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }
    public void clear() {
        modCount++;
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }
    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }
    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData  = grow();
        elementData[s] = e;
        size = s + 1;
    }
    private Object[] grow() {
        return grow(size + 1);
    }
    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            int newCapacity = MyList.newLength(oldCapacity,
                    minCapacity - oldCapacity,
                    oldCapacity >> 1           );
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }
    public static int newLength(int oldLength, int minGrowth, int prefGrowth) {


        int prefLength = oldLength + Math.max(minGrowth, prefGrowth);
        if (0 < prefLength && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
            return prefLength;
        } else {

            return hugeLength(oldLength, minGrowth);
        }
    }

    private static int hugeLength(int oldLength, int minGrowth) {
        int minLength = oldLength + minGrowth;
        if (minLength < 0) {
            throw new OutOfMemoryError(
                    "Required array length " + oldLength + " + " + minGrowth + " is too large");
        } else if (minLength <= SOFT_MAX_ARRAY_LENGTH) {
            return SOFT_MAX_ARRAY_LENGTH;
        } else {
            return minLength;
        }
    }
}










