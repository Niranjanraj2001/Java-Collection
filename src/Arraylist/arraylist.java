package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylist {

        public static void main(String args[]){
            ArrayList<Integer> a1=new ArrayList<Integer>();
            a1.add(1);
            a1.add(2);
            a1.add(4);
            a1.add(3);
            a1.add(5);
            a1.add(2);
            a1.add(2,8);
            a1.set(4,10);
            System.out.println(a1);
            a1.remove(5);     //remove the value from the index 5

            //Collections.sort(a1);


            System.out.println(a1);
            System.out.println(a1.get(2));   //get the value from tha index 2
            System.out.println(a1.contains(10));   // if the 10 present in tha list.if contains tit show true
//        a1.clear();              //clear all element from the list
//        System.out.println(a1);
            System.out.println(a1.subList(0,3));   //get the particular element
            System.out.println(a1.size());      //return the arraylist size


            ArrayList <Integer> a2 = new ArrayList<Integer>();
            a2.add(11);
            a2.add(12);
            a2.addAll(a1);
            //System.out.println(a2);
            //System.out.println(a1);

//        a2.removeAll(a1);
//        System.out.println(a2);

//        a1.indexOf(2);
//        a1.lastIndexOf(2);
//        System.out.println(a1);

            System.out.println(a1.containsAll(a2));
            System.out.println(a1.equals(a2));     //it check a1 and a2 are equal

            System.out.println(a1.hashCode()); //return hashcode

            ArrayList <Integer> a3 = new ArrayList<Integer>();
            a3.add(22);
            a3.add(33);
            a3=(ArrayList) a1.clone();
            a3.add(77);
            //System.out.println(a3);
            System.out.println(a1);

            Iterator<Integer> itr =  a1.iterator();
            while(itr.hasNext()){
                if(itr.next().equals(2)){
                    itr.remove();

                }
                System.out.println(itr.next());

                System.out.println();
            }



//        for(Integer st:a1){
//            System.out.println(st);
//        }

//        for(int i=0;i<a1.size();i++){
//            System.out.println(a1.get(i));
//        }

//        Iterator<Integer> itr = a1.iterator();    //only forward
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        ListIterator itr = a1.listIterator();    //forward and backwars
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println();
//        while(itr.hasPrevious()){
//            System.out.println(itr.previous());    //hasPrevious return boolean
//
//        }


        }
    }


