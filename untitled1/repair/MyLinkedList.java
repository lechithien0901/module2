package repair;



public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head=new Node(data);
    }
    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index,Object data){
        Node total=head;
        Node calm;
        for (int i = 0; i <index-1&&total.next!=null ; i++) {
             total=total.next;

        }
        calm=total.next;
        total.next=new Node(data);
        (total.next).next=calm;
        numNodes++;
    }
    public void addFirst(Object data){
        Node total=head;
        head=new Node(data);
        head.next=total;
        numNodes++;
    }
    public Node get(int i){
        Node temp=head;
        for (int j = 0; j <i; j++) {
            temp=temp.next;

        }
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList(10);
        myLinkedList.addFirst(11);

    }
}


