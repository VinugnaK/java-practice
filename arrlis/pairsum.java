package arrlis;
import java.util.*;
public class pairsum {
    public static boolean pair2p(ArrayList<Integer> List,int target){
        int lp=0;int rp=List.size()-1;
        while(lp<rp){
        
            if((List.get(lp)+List.get(rp))==target){
                return true;
            }
            if((List.get(lp)+List.get(rp))>target){
                rp--;
            }
             else{
                lp++;
            }

        }return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(5);
        List.add(4);
Collections.sort(List);
        System.out.println(List);
        int target=10;
        System.out.println(pair2p(List,target));
    }
    
}
