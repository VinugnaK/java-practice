package linkedlist;
//basic .. like created a node which iwll have a data and next
public class linked1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
     linked1 lin=new linked1();
     lin.head=new Node(1);
     lin.head.next=new Node(2);
    }
}
