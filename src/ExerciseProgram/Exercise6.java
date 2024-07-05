package ExerciseProgram;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>(40);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.size());
        al.trimToSize();
        System.out.println(al.size());

    }
}
