import java.util.*;

public class ArrayLt{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(6);
        list.add(7);

        System.out.println(list);
        
        //get elements
        int elm = list.get(0);   //index
        System.out.println(elm);
        
        //add el in between
        list.add(1,1);
        System.out.println(list);
        

        //set element
        list.set(0,5);
        System.out.println(list);
        
        
        //delete
        list.remove(2);   //index
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

    }
}