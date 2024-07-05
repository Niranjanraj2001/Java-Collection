package Comprable;



import java.util.ArrayList;
import java.util.Collections;

class students1 implements Comparable<students1>{
    int rollno;
    String name;
    String dept;
    long mobileno;

    students1(int rollno,String name,String dept,long mobileno){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.mobileno=mobileno;
    }
    public String toString()
    {
        return rollno+" "+name+" "+dept+" "+mobileno;
    }
//    public int compareTo(students1 o)
//    {
//        return name.compareTo(o.name);
//    }
    public int compareTo(students1 i){
        if(rollno==i.rollno)
            return 0;
        else if (rollno>i.rollno)
            return 1;
        else
            return -1;

    }




}

public class comparable {
    public static void main(String args[]) {
        students1 s1 = new students1(1, "Niranjan", "cse", 9790289163l);
        students1 s2 = new students1(4, "Raj", "cse", 9790909063l);
        students1 s3 = new students1(2, "Ranjith", "cse", 9790277863l);
        students1 s4 = new students1(3, "Vimal", "cse", 9790298163l);

        ArrayList<students1> stu = new ArrayList<students1>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);


        Collections.sort(stu);
        for(students1 st:stu){
            System.out.println(st);
        }
    }
}
