package ExerciseProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {
    public static void main(String args[]){
            ArrayList<Integer> al=new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);
            System.out.println(al);

        Collections.shuffle(al);

        System.out.println(al);

        }
}
