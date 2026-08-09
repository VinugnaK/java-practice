package greedyprblm;

//same like maxact..
import java.util.*;

public class maxlenpair {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(pairs[0][0]);
        int count = 1;
        int lastend = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            // (a,b),(c,d)----b<c or c>b...then u can tell that those are mnnot overlapping
            if (lastend < pairs[i][0]) {
                count++;
                ans.add(pairs[i][1]);
                lastend = pairs[i][1];
            }
        }
        System.out.println(count);
    }

}
