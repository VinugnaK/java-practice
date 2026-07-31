package Queue;

class circularqueueusingarray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // to find empty/not
        public static boolean isEmpty() {
            // return arr.length==0;
            return rear == -1 && front == -1;// this means the elements are not inserted
        }

        // to chech if the array is full
        public static boolean isFull() {
            return (rear + 1) % size == front;// it means that in the front already an element is there and front cannot
                                              // go there
        }

        // add
        public static void add(int data) {// O(1)
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;// adding element for teh first time
            }
            rear = (rear + 1) % size;// as it is circular queue, and rear add's elements, if the starting of array
                                     // is empty , using that formula we can access the starting element to add the
                                     // elements
            arr[rear] = data;

        }

        // to remove elements int the queue
        public static int remove() {// O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // Last element deleted
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // for the peek(top element) TC:O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
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