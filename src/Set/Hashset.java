package Set;

import java.util.Comparator;
import java.util.HashSet;

public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(null);
        hs.add(10);

        System.out.println(hs);



//        class temp implements Comparator<Integer>{
//        public int compare(Integer h1,Integer h2){
//            if(h1>h2)
//                return -1;
//            else if(h1<h2)
//                return 1;
//            else
//                return 0;
//        }
    }

    }

