package linkedlist;

public class loops {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public boolean detectloop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeloop() {
        // detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }

        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        // makethe meeting's point's prev node as null
        prev.next = null;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        loops l1 = new loops();
        l1.addlast(0);
        l1.addlast(1);
        l1.addlast(2);
        l1.addlast(3);
        l1.addlast(4);
        tail.next = head.next.next;
        System.out.println("Cycle Present : " + l1.detectloop());
        l1.removeloop();
        l1.print();

    }

}
