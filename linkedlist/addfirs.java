package linkedlist;

public class addfirs {
    public static class Node{
      int data;
      Node next;
    
    public Node(int data){
     this.data=data;
     this.next=null;
    }}
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        //step1:- create a new node
        Node newnode=new Node(data);
        //basecase: if there is no node and u try to add a new node
        if(head==null){
            head=tail=newnode;
        }
        //step 2:reassign the new node's next 
        newnode.next=head;
        //steo 3: reassign the value of head
        head=newnode;
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
   
    public void printll(){
        if(head==null){System.out.println("Linked dlist is empty");}
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }System.out.println();

    }

    public void addmid(int idx,int data){
        Node newnode=new Node(data);

        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newnode.next=temp.next;
        temp.next=newnode;
    }



    public static void main(String[] args) {
        addfirs ll=new addfirs();
        ll.printll();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.printll();
        ll.addmid(2, 234);
        ll.printll();
        
    }
}
