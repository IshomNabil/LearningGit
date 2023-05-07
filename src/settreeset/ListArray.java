package settreeset;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListArray {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>(2);
        System.out.println(al+", size = " +al.size());
       
        al.add("A");
        al.add("B");
        al.add("C");
        al.add(new String("x"));
        al.add(2, new Integer(10));
        System.out.println(al+ ", size = " + al.size());


    al.remove("C");
    System.out.println((al+", size = " + al.size()));

    Boolean b = al.contains("x");
    System.out.println("The list contains x = " + b);
    b = al.contains("y");
    System.out.println(" The list contains y = " + b);
    b = al.contains(new Integer(10));
    System.out.println(" The list contains Integer of 10 = " +b );

    ListIterator li = al.listIterator();
    while (li.hasNext())
        System.out.println(" From ListIterator = " + li.next());
    }
}
