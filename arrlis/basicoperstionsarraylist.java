package arrlis;
import java.util.*;
public class basicoperstionsarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add --> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);

        //get -->O(1)
        int ele=list.get(0);
        System.out.println(ele);

        //delete-->O(n)
        list.remove(0);
        System.out.println(list);

        //set --O(n)
        list.set(0,5);
        System.out.println(list);

        //contains an element or not
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));

        //to print size of list
        System.out.println(list.size());

        //to print arraylist
        System.out.println("print arraylist");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

        //to print reverse of a arraylist
        System.out.println("reverse of a list");
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" ");
        }

        //to print maximum in arraylist
        System.out.println("maximum in array list");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);

        //swap 2 numbers
        System.out.println("swap 2 numbers");
        int idx1=0;int idx2=2;
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);

        //sorting an arraylist
        System.out.println("sorting arraylist");
        //optimized version is using collections.sort(ascending)
        Collections.sort(list);
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}
