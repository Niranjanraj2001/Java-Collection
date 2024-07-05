package Vector;

import java.util.Vector;

public class vector {
    public static void main(String args[]){

        Vector<Integer> v1=new Vector<Integer>(3,1);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        System.out.println(v1);

        v1.addElement(7);
        v1.insertElementAt(50,3);   //inssrt obj based on index
        System.out.println(v1.elementAt(2));  //return the index values's object
        System.out.println(v1.firstElement());   // return the 0 index value
        System.out.println(v1.indexOf(50));  //return the object's index value
        v1.setElementAt(30,4);    //insert object to based on index value
        System.out.println(v1.hashCode());     //return the hash code
        System.out.println("capacity: "+v1.capacity());    // show the capacity
        System.out.println("size: "+v1.size());        //return the size
        v1.trimToSize();
        System.out.println("new capacity: "+v1.capacity());
        v1.addElement(10);

        System.out.println(v1);

        Integer arr[] = new Integer[10];
        //datatype var[]=new datatype[v1.size()];
        v1.copyInto(arr);

        for(Integer i:arr)
        {
            System.out.println(i);
        }


        Vector<String> v2= new Vector<>();
//        v2.addAll(v1);
//        v2.removeAll(v1);

        v2.addElement("hii");
        v2.addElement("hello");

        v2.remove(1);     // remove element based on the index



        System.out.println(v2);



    }
}
