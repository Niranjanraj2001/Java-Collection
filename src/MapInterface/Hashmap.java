package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"niranjan");
        hm.put(2,"sanjeev");
        hm.put(3,"vignesh");
        hm.put(4,"vinoth");
        hm.put(5,"ranjith");
        hm.put(6,null);
        System.out.println(hm);


        hm.put(2,"vimal");  //if u put the value in that same assigen value.it will replace the value

        hm.putIfAbsent(6,"sanjeev"); //if value null it will replace the value.
        hm.putIfAbsent(6,"jeeva");  //if it present leave it.

        //hm.clear(); //clear all key and values.

        //hm.remove(4);  //remove the 4th key.
        //hm.remove(4,"Vinoth");  //if 4th key and value should same it will remove other wise not remove.

        System.out.println(hm.containsValue("niranjan"));  //value present return true.
        System.out.println(hm.containsValue("Niranjan"));  //return false.

        System.out.println(hm.containsKey(1));  //key present true.
        System.out.println(hm.containsKey(7));  //key not present false.

        System.out.println(hm.get(1));  // return 1st key value.
        System.out.println(hm.get(7));  //key value not present it return null.

        System.out.println(hm.getOrDefault(1,"not found"));  //key present give value.
        System.out.println(hm.getOrDefault(7,"not found"));  //key not present set default value.

        //hm.replace(4,"sam");  //replce key's value
        hm.replace(4,"Vinoth","sam");  //older value and key value match it replace.

        System.out.println(hm.values());  //return values only.
        System.out.println(hm.keySet());  //return keys only.
        System.out.println(hm.size());    //return size.

        System.out.println(hm.isEmpty());  //is empty return true.

        System.out.println("iterating HashMap");


        for(Map.Entry e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            //System.out.println(e);
        }







        System.out.println(hm);




    }
}
