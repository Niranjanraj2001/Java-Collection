package Set.SortedSet;

import java.util.TreeSet;

public class Treeset {
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(30);
        ts.add(50);

        System.out.println(ts);
        //sorted set method
        System.out.println(ts.ceiling(45));  //return 45 next greater value like 50.

        System.out.println(ts.floor(45));  //retur 45 before lowest value like 40.

        System.out.println(ts.descendingSet());  //reverse the integer.

        System.out.println(ts.headSet(30));  //30 before value print.

        System.out.println(ts.tailSet(30));  //30 value and 30 after value print.

        System.out.println(ts.subSet(10,50));   //starting value and ending value before value. 10,20,30,40.

        //Navigable set Methods.
        System.out.println(ts.higher(45));   //similar to celling

        System.out.println(ts.lower(45));    //similar to floor

        System.out.println(ts.headSet(30,true));  //if true 30 and before value.

        System.out.println(ts.tailSet(30,false));  //if false after 30 values print. 30 not print

        System.out.println(ts.subSet(20,true,50,false));  //20,30,40

    }
}
