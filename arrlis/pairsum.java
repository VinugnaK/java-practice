package arrlis;
import java.util.*;
public class pairsum {
    //pair sum of sorted array
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
    //pairsum of sorted+rotated array
    public static boolean pairsumrot(ArrayList<Integer> List,int target){
        int bp=-1;
        for(int i=0;i<List.size();i++){
            if(List.get(i)>List.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;
        int n=List.size();
        while(lp!=rp){
            int sum=List.get(lp)+List.get(rp);
           if(sum==target) return true;
           if(sum<target) lp=(lp+1)%n;
           else rp=(n+rp-1)%n;
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(4);
        List.add(5);
        List.add(1);
        List.add(2);
        List.add(3);
//Collections.sort(List);
       // System.out.println(List);
        int target=7;
        //System.out.println(pair2p(List,target));
        System.out.println(pairsumrot(List, target));
    }
    
}
