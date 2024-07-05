package ExerciseProgram;

import java.util.LinkedList;

public class Exercise9 {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println(ll);

        ll.addFirst(10);
        ll.addLast(60);

        System.out.println(ll);


    }
}
