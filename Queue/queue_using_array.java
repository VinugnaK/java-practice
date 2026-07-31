package Queue;

class queue_using_array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // to find empty/not
        public static boolean isEmpty() {
            // return arr.length==0;
            return rear == -1;// this means the elementa rae not inserted
        }

        // add
        public static void add(int data) {// O(1)
            if (rear == size - 1) {
                System.out.println("aueue is empty");
                return;
            } else {
                rear = rear + 1;
                arr[rear] = data;

            }
        }

        // to remove elements int the queue
        public static int remove() {// O(n)
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // for the peek(top element)
        public static int peek() {// O(1)
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}