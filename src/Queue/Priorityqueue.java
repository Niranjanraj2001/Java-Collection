package Queue;
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//
//
//class temp implements Comparator <Integer>{
//    public int compare(Integer i,Integer j){
//        if(i==j)
//            return 0;
//        else if(i>j)
//            return 1;
//        else
//            return -1;
//    }
//
//}
//
//
//
//    public class queue {
//    public static void main(String args[]){
//        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new temp()); //inside constructor using comparator
//        pq.offer(300);            //using insert element
//        pq.offer(800);
//        pq.offer(700);
//        pq.offer(60);
//        pq.offer(90);
//
//        System.out.println(pq);
//        pq.poll();               //remove the first value
//        System.out.println(pq);
//        System.out.println(pq.peek());
//
//
//
//
//    }
//}



import java.util.*;
public class Priorityqueue {
    public static void main(String args[])
    {


        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new Hello());


        pQueue.offer(90);
        pQueue.offer(20);
        pQueue.offer(50);
        pQueue.offer(60);
        pQueue.offer(80);
        pQueue.offer(30);
        pQueue.offer(7);
        pQueue.offer(40);
        pQueue.offer(200);

        System.out.println(pQueue);
//        while (!pQueue.isEmpty()) {
//            System.out.print(pQueue.poll() + " ");
//        }
//
        //System.out.println(pQueue);
        //Collections.sort(pQueue);

        System.out.println(pQueue.poll());     //remove the 0th element
        System.out.println(pQueue);

        System.out.println(pQueue.peek());      //return the 0th index value
        System.out.println(pQueue);
    }

}
class Hello implements Comparator<Integer>{
    public int compare(Integer p1,Integer p2){
//        if(p1>p2)
//            return -1;
//        else if(p1<p2)
//            return 1;
//        else
//            return 0;
        if(p1==p2)
            return 0;
        else if(p1>p2)
            return 1;
        else
            return -1;
}
}
