package Queue.Deque;
import java.util.*;

public class arrayDeque {


    public static void main(String args[]){
        ArrayDeque<String> aq=new ArrayDeque<String>();
        aq.offer("appla");
        aq.offer("orange");
        aq.offer("banana");
        aq.offer("grapes");

        System.out.println(aq);

        aq.offerFirst("kiwi");     //Arraydeque method insert at 1st position
        aq.offerLast("papaya");    //Arraydeque method insert at last position

        System.out.println(aq);

        aq.pollFirst();             //remove first element
        System.out.println(aq);

        aq.pollLast();          //remove last element
        System.out.println(aq);

        System.out.println(aq.peekFirst());   //return first value of the queue

        System.out.println(aq.peekLast());    //return last value of the queue

        System.out.println(aq.getFirst());    //linkedlist method return 0th index

        System.out.println(aq.getLast());      //linkedlist method return last index




    }
}
