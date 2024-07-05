package ExerciseProgram;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise13 {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        ArrayList <Integer> al=new ArrayList<Integer>(ll);

       System.out.println(al);


       for(Integer i:al){
            System.out.println(i);
        }

    }
}
