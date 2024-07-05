package ExerciseProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        System.out.println(ll);   // 1

        for (Integer i : ll) {         //2
            System.out.println(i);
        }

        for (int i = 0; i < ll.size(); i++) {   //3
            System.out.println(ll.get(i));
        }

        Iterator<Integer> it = ll.iterator();  //4
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator<Integer> itr = ll.listIterator();  //5
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
