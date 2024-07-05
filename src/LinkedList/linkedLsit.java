package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedLsit {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println(ll);

        ll.addFirst(5);       //adding first index
        ll.addLast(55);       //adding last index

        System.out.println(ll);

//        Iterator it= ll.descendingIterator();
//        while(it.hasNext())
//            System.out.println(it.next());

        ListIterator it= ll.listIterator();
        while(it.hasNext())
        {
            it.next();
        }
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }

        System.out.println(ll.getFirst());   //get the value from the 0th index
        System.out.println(ll.getLast());    //get the value from the last indeex


        ll.removeFirstOccurrence(5);   //5 occur 2 times it will remove the first 5.it will check from the 0th index
        ll.removeLastOccurrence(55);   //it will check from the last index

        System.out.println(ll);


    }
}
