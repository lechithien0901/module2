package repair;

public class MyLinkedListQueue {
   class Node{
      public Node next;
       public int key;
       public Node(int key){
           this.key=key;
           this.next=null;
       }

   }
   private Node head;
   private Node tail;
   public MyLinkedListQueue(){
       this.head=null;
       this.tail=null;
   }
   public void enqueue(int key){
       Node temp=new Node(key);
       if (tail==null){
           this.head=this.tail=null;

       }
       tail.next=temp;
       this.tail=temp;
   }
   public Node dequeue(){

       if (this.head==null)
           return null;

       Node temp=this.head;
       this.head=this.head.next;
if (this.head==null)
    this.tail=null;
return temp;
   }


}
