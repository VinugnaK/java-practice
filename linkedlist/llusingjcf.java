package linkedlist;

import java.util.LinkedList;
//import java.util.*;

class llusingjcf {
    public static void main(String args[]) {

        // create(u cannot use int ,float,char......u shd use Integer,Character,Float)
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(2);
        ll.addFirst(1);

        // print
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
