package greedyprblm;

import java.util.*;

//end time is sorted..
public class maxact {

    public static void unsortedend(int start[], int end[]) {
        // if question is sorted acc to end time thwen create a 2d array and sort it
        // 1st column- store idx, 2nd column store start and 3rd column store end
        int activities[][] = new int[start.length][3];

        for (int i = 0; i < end.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // sort based on col 2
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // to count and store the answer
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // loop to analyze max act
        maxact = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];// coz idx 2 is end
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastend) {
                maxact++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }

        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        System.out.println("max act are: " + maxact);

    }

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
