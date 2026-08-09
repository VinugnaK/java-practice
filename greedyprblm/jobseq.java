package greedyprblm;

import java.util.*;

public class jobseq {

    static class Job {
        int deadline;
        int profit;
        int id;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        int jobsInfo[][] = {
                { 4, 20 },
                { 1, 10 },
                { 1, 40 },
                { 1, 30 }
        };

        // Create Job objects
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort jobs by decreasing profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        /*
         * Job Deadline Profit AFTER SORTING
         * {1,40} 1 40
         * {1,30} 1 30
         * {4,20} 4 20
         * {1,10} 1 10
         */
        // Find maximum deadline
        int time = 0;

        ArrayList<Integer> seq = new ArrayList<>();
        // Start from the deadline and move backwards
        for (int j = 0; j < jobs.size(); j++) {
            Job curr = jobs.get(j);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        // Print sequence
        System.out.println("max jobs = " + seq.size());

        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
        }

    }
}