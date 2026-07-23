package linkedlist;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        // Corner case
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        // spl case
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        // spl case
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        dll.removelast();
        dll.print();
        dll.addLast(9);
        dll.print();

    }

}
