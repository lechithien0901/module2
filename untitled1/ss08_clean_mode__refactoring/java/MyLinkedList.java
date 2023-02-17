package ss08_clean_mode__refactoring.java;

//import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;
    private int numNotdes;
    public  MyLinkedList(Object data){
        head=new Node(data) ;
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }


        public java.lang.Object getData() {
            return data;
        }
        public void add(int index,Object data){
            Node temp=head;

            for (int i = 0; i <index-1 ; i++) {

            }
    }

    }
}
