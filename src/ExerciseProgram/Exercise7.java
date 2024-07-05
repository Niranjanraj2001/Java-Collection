package ExerciseProgram;

import java.util.ArrayList;

public class Exercise7 {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        al.ensureCapacity(7);
        al.add(60);
        al.add(70);
        System.out.println(al);
    }
}
