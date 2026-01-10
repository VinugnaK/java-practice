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
    public static int size;  //for finding size...places at all insertions put size++...

    public void addfirst(int data){
        //step1:- create a new node
        Node newnode=new Node(data);
        size++;
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
        //create  a new node
        Node newnode=new Node(data);
         size++;
         //base case
        if(head==null){
            head=tail=newnode;
            return;
        }
        //assign the value of new node to tail's next 
        tail.next=newnode;
        //resassign tail value
        tail=newnode;
    }
   
    public void printll(){
        if(head==null){System.out.println("Linked dlist is empty");}
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }System.out.println("null");

    }

    public void addmid(int idx,int data){
        //base case
        if(idx==0){
            addfirst(data);
            return;
        }
        //create a new node
        Node newnode=new Node(data);
        size++;
        //vars for reaching th point of insertion 
        Node temp=head;
        int i=0;
    //after this loop u will reach the pint where u want to insert the new node
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
     //reassign the values of new node connection to next and that next to new node ...once see ur notes
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int removefirst(){
        if(size==0){System.out.println("Linked List is empty");}
        //if linked list has only 1 element
        if(size==1){
            int n=head.data;
            head=tail=null;
            size=0;
            return n;

        }
        int n=head.data;
        head=head.next;
        size--;
        return n;
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
        System.out.println(ll.size);
        ll.removefirst();
        ll.printll();
        
    }
}
