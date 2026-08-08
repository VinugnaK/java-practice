package greedyprblm;

//end time is sorted..
import java.util.*;

public class maxact {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // to count and store the answer
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // loop to analyze max act
        maxact = 1;
        ans.add(0);
        int lastend = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastend) {
                maxact++;
                ans.add(i);
                lastend = end[i];
            }

        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        System.out.println("max act are: " + maxact);

    }
}
