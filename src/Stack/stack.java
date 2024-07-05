package Stack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<Integer> s1=new Stack<>();
        System.out.println(s1);

        System.out.println(s1.empty());        //is empty return true
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.pop();                 // remove the value from the top of the stack
        System.out.println(s1);
        System.out.println(s1.empty());        //is not empty return false

        System.out.println("peek value: "+s1.peek());

        System.out.println("first element: "+s1.firstElement());

        System.out.println(s1.indexOf(40));    //return index value of the object

        System.out.println(s1.search(30));     //return the position value

        System.out.println(s1.get(3));   //if u give index value it will give index value's object

        //Collections.sort(s1.new Hello3());
        System.out.println(s1);

    }
}
