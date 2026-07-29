package Stack;

import java.util.*;

public class StockSpan {
    static void stkspn(int[] stock, int[] span) {
        Stack<Integer> s = new Stack();
        // intialize the span and stock for 0th element
        s.push(0);
        span[0] = 1;
        // make while loop to find the previous high element ....ensure about the empty
        // element also
        for (int i = 1; i < stock.length; i++) {
            int currprice = stock[i];
            while (!s.isEmpty() && currprice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);

        }
    }

    public static void main(String args[]) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length + 1];
        stkspn(stock, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
