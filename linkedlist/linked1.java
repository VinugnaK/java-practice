package linkedlist;

//basic .. like created a node which iwll have a data and next
public class linked1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // step 1: create a new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2: point the new node's next to head
        newnode.next = head;
        // step 3:update the head
        head = newnode;
    }

    public void addLast(int data) {
        // step1: create a new node
        Node nod = new Node(data);
        if (head == null) {
            head = tail = nod;
            return;
        }
        // step 2:connect the tail node to new node
        tail.next = nod;
        // step 3:update the tail
        tail = nod;
    }

    public void print() {
        // create temp node
        Node temp = head;
        while (temp != null) {
            // print the temp data
            System.out.print(temp.data + "-->");
            // update the temp data while temp.next!=null
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addidx(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void main(String[] args) {
        linked1 ll = new linked1();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(9);
        ll.addidx(0, 6);
        ll.print();

    }
}
