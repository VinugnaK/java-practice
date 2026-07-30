package Stack;

//finding the next greater element
import java.util.*;

public class nextgeaterele {
    static void ng(int[] arr, int[] greater) {
        Stack<Integer> s = new Stack();
        for (int i = arr.length - 1; i >= 0; i--) {
            // runs till stack not empty and stack's top element <= the current element and
            // removes it, so that when we get the greater element than the current element
            // we can store in the array
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // after poping if the stack is not empty the array will store the top element
            if (s.isEmpty()) {
                greater[i] = -1;
            } else {
                greater[i] = arr[s.peek()];
            }
            // the stack will store the index of the greater element
            s.push(i);

        }

    }

    // to find the max are of the combination of rectangles in the histogram
    static int maxAreaHist(int arr[]) {
        int[] nsl = new int[arr.length];
        int nsr[] = new int[arr.length];
        int maxh = 0;

        // next smallest right..same as ngr but change in while condition for ngr it is
        // <= arr[i] but for nsl it is >=arr[i]
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                // -1
                nsr[i] = arr.length;
            } else {
                // top ele
                nsr[i] = s.peek();
            }
            s.push(i);

        }
        // next smallest left
        // empty the stack and start for nsr(same as nsl but starts from starting)
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                // -1
                nsl[i] = -1;
            } else {
                // top ele
                nsl[i] = s.peek();
            }
            s.push(i);

        }

        // current area--width=j-i-1=nsr[i]=nsl[j]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            if (area > maxh) {
                maxh = area;
            }

        }
        return maxh;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        int[] greater = new int[arr.length];
        ng(arr, greater);
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(greater[i]);

        }
        System.out.println(maxAreaHist(arr));
    }

}
