package Queue;

import java.util.*;

//this is for even number of elements case only
// if input is 1,2,3,4,5,6,7,8,9,10...then output shd be 1,6,2,7,3,8,4,9,5,10
//basically we are taking 2 queues..1 with half of input and other with rest half.. then i will remove ele from q1 and add in q2 and remove from q2 and add it into itself..i will do it til the q1 is empty..
class interleave2half {
    public static void zigzagfromhalf(int arr[]) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            q1.add(arr[i]);
        }

        for (int i = size / 2; i < arr.length; i++) {
            q2.add(arr[i]);
        }
        // main logic
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
            q2.add(q2.remove());
        }
        // to print
        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();

        }

    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;

        }
        zigzagfromhalf(arr);

    }
}