package Arraylist;

import java.util.ArrayList;





class students{
        int rollno;
        String name;
        String dept;
        long mobileno;

        students(int rollno,String name,String dept,long mobileno){
            this.rollno=rollno;
            this.name=name;
            this.dept=dept;
            this.mobileno=mobileno;
        }
        public String toString()
        {
            return rollno+" "+name+" "+dept+" "+mobileno;
        }




    }

public class Arrayexample {

    public static void main(String args[]){
            students s1=new students(1,"Niranjan","cse",9790289163l);
            students s2=new students(2,"Raj","cse",9790909063l);
            students s3=new students(3,"Sasi","cse",9790277863l);
            students s4=new students(4,"Keerthana","cse",9790298163l);

            ArrayList<students> stu = new ArrayList<students>();
            stu.add(s1);
            stu.add(s2);
            stu.add(s3);
            stu.add(s4);


//        System.out.println(stu);

            for(students st:stu){
                System.out.println(st);
            }

//        Iterator <students> st=stu.iterator();
//        while(st.hasNext())
//        {
//            System.out.println(st.next());
//        }


        }
    }


