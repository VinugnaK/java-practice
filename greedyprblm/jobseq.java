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
         * {4,20} 4 20 Ninety rupees Vietnamese coffee classic cold coffee platinum
         * debit card is animals I mean almost six ninety nine seven sixty seven forty
         * eight seven forty eight plus seventy six two forty nine hundred mL two
         * professionals twenty packs fifty four cup noodles excluding list not less
         * tomato chicken one thirty four plus seventy nine percent in total hundred
         * rupees it's desert species bye bye one minute one minute for ten minutes
         * twenty one day confirmation twenty one day straight some sexy type of dresses
         * series but the thing is tutorial dance so contract person so much money worst
         * job in the world very good I think I should be there it's so major related so
         * definitely competition I think what are your strengths I respect your
         * thoughts I am totally agreeing enjoy, so I wish someone by saying I know how
         * to drive. never touched manual never I swear now which is not a good feeling
         * and panic and and it's not nice Complete speak is in the media. but that's
         * off accomplishment He's my best friend. They are already wearing the blouses.
         * Outfit is outfit exactly. Like for me, that's a big thing. I don't really
         * care. for me, I'm so glad to have expectation better company butter channel
         * YouTube channel production team, we're back to love the family, just season
         * fourteen season eight years back four plus six years back closest friend I
         * try to enjoy I'm very expecting even last this long and see the cameras so I
         * just wanna be done that ex fair competition I don't feel this is very fair
         * and yes
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