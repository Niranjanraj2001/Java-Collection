package ExerciseProgram;

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        ArrayList<Integer> all = new ArrayList<Integer>();
        all.add(1);
        all.add(5);
        all.addAll(al);

        System.out.println(all);



    }

}
