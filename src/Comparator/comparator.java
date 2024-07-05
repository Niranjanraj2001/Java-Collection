package Comparator;

import java.util.*;


class emp1{
    int empid;
    String name;
    int salary;
    emp1(int empid,String name,int salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return empid+" "+name+" "+salary;
    }
}
//class idComparator implements java.util.Comparator<emp1> {  // for emp id
//    public int compare(emp1 i,emp1 j){
//        if(i.empid== j.empid)
//            return 0;
//        else if(i.empid>j.empid)
//            return 1;
//        else
//            return -1;
//    }
//
//
//}

class idComparator implements java.util.Comparator<emp1> {  //for salary
    public int compare(emp1 i,emp1 j){
//        if(i.salary== j.salary)
//            return 0;
         if(i.salary>j.salary)
            return 1;
        else
            return -1;
    }
}

class name implements java.util.Comparator<emp1>{         //for String
    public int compare(emp1 i,emp1 j){
        return i.name.compareTo(j.name);
    }

}



public class comparator<E> {
    public static void main(String args[]){
        emp1 e1=new emp1(01,"Niranjan",25000);
        emp1 e2=new emp1(04,"sanjay",30000);
        emp1 e3=new emp1(05,"santhosh",44000);
        emp1 e4=new emp1(02,"ranjith",33000);
        emp1 e5=new emp1(03,"vimal",29000);

        //System.out.println(e1.empid+" "+e1.name+" "+e1.salary);



        ArrayList<emp1> em=new ArrayList<emp1>();
        em.add(e1);
        em.add(e2);
        em.add(e3);
        em.add(e4);
        em.add(e5);

        System.out.println(em);
        System.out.println();

        Collections.sort(em,new idComparator());     //for empid and salary
        for(emp1 i:em){
            System.out.println(i.empid+" "+i.name+" "+i.salary);
        }

//        Collections.sort(em,new name());
//        //Collections.sort(em,Collections.reverseOrder(new name()));   //for revere order
//        for(emp1 i:em){
//            System.out.println(i.empid+" "+i.name+" "+i.salary);
//        }


    }
}
