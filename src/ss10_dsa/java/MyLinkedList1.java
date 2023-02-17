package ss10_dsa.java;

import org.w3c.dom.Node;
import org.w3c.dom.Notation;

public class MyLinkedList1 {
    private int numNodes=0;
   private Node head;
 public MyLinkedList1(Object data){
       head=new Node (data);
   }
   private class Node{
     private Node next;
     private Object data;
     public Node(Object data){
         this.data=data;
     }
     public Object getData(){
         return this.data;
     }


   }
   public void add(int index,Object data){
     Node temp=head;
     Node holder;
     for(int i=0;i<index-1 && temp.next!=null;i++){
         temp=temp.next;
     }


   }

}
