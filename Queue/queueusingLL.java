package Queue;

class queueusingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // to find empty/not
        public static boolean isEmpty() {

            return head == null && tail == null;
        }

        // add
        public static void add(int data) {// O(1)
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        // to remove elements int the queue
        public static int remove() {// O(1)
            // no element
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = head.data;

            // single element
            if (head == tail) {
                tail = head = null;
            } else {
                head = head.next;
            }

            return result;
        }

        // for the peek(top element) TC:O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}