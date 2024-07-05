package ExerciseProgram;

import java.util.LinkedList;

public class Exercise12 {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        LinkedList<Integer> lq = new LinkedList<Integer>();
        lq.add(100);
        lq.add(20);
        lq.add(300);
        lq.add(40);
        lq.add(500);
        lq.add(60);

        LinkedList<Integer> lq1 = new LinkedList<Integer>();

        for(int i=0;i<ll.size();i++){
            for(int j=0;j<lq.size();j++){
                if(ll.get(i)==lq.get(j)){
                    lq1.add(ll.get(i));
                }
            }
        }
        System.out.println(lq1);


    }
}
