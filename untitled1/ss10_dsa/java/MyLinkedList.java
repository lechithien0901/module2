package ss10_dsa.java;
 import java.util.LinkedList;

public class MyLinkedList <E>{
    private Node head;
    private Node tail;

    private int numNodes;
    public  MyLinkedList(Object data){
        head=new Node(data) ;
    }
     private class Node<Object>{
        private Node next;
      private  Object data;
        public Node(Object data){
            this.data=data;

        }
        public Object getData() {
            return this.data    ;
        }




        }

    public void add(int index,E data){
        Node temp=head;
        Node holder;

        for (int i = 0; i <index-1 ; i++) {
            temp=temp.next;

        }
        holder=temp.next;
        temp.next=new Node(data);
        (temp.next).next=holder;
        numNodes++;

    }
    public void addFirst(E data){
        Node temp=head;

        head=new Node(data);
        head.next=temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp=head;
        if(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public void addLast(E data) {
        Node temp = new Node(data);
        if (tail != null) {
            head = tail = temp;

        } else {
            tail.next = temp;
            tail = tail.next;
        }
        numNodes++;
    }
    public Object remove(int index){
        if (index<0||index>=numNodes)return null;
        else if(index==0)return removeFirst();
        else if(index==numNodes-1) return removeLast();
        else{
            Node previous=head;
            for (int i = 0; i <index ; i++) {
                previous=previous.next;

            }
            Node current=previous.next;
            previous.next=current.next;
            previous.next=current.next;
            numNodes--;
                return current.data;

       }

   }
   public  Object removeFirst(){
        if (numNodes==0)return null;
        else {
            Node temp=head;
            head=head.next;
            numNodes--;
            if (head==null)tail=null;
            return temp.data;
        }
   }
    public   Object removeLast() {
        if (numNodes == 0) return null; // Nothing to remove
        else if (numNodes == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            numNodes = 0;
            return temp.data;
        } else {
            Node current = head;

            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return temp.data;
        }
    }

    public static void main(String[] args) {
        LinkedList<MyLinkedList>list=new LinkedList<>();

        list.size();
    }



}



