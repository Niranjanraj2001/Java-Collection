package ExerciseProgram;

import java.util.PriorityQueue;

public class Exercise15 {
    public static void main(String args[]){

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.offer(90);
        pq.offer(20);
        pq.offer(50);
        pq.offer(60);
        pq.offer(80);
        pq.offer(30);
        pq.offer(7);
        pq.offer(40);

        System.out.println(pq);

        PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();

        pq1.addAll(pq);

        System.out.println(pq1);


    }
}
