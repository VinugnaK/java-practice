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
    public static int size;

    public void addFirst(int data) {

        // step 1: create a new node
        Node newnode = new Node(data);
        size++;
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
        size++;
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
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = tail.data;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        tail = prev;
        prev.next = null;
        size--;
        return val;
    }

    public int linearitrsearch(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) {// key found
                return idx;
            } else {
                temp = temp.next;
                idx++;
            }
        }
        return -1; // key not found

    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        linked1 ll = new linked1();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(9);
        ll.addidx(3, 6);
        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        ll.removeLast();
        ll.print();
        int q = ll.linearitrsearch(3);
        System.out.println(q);
        System.out.println(ll.recsearch(0));

    }
}
