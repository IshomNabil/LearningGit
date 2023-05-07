package hashsetlatihan;

import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[]args){
        Set ts = new TreeSet<>();

        ts.add("satu");
        ts.add("dua");
        ts.add("tiga");
        ts.add("empat");
        ts.add("lima");

        System.out.println(" Anggota dari TreeSet = " + ts);

        Set ts2 = new TreeSet();

        ts2.add(1);
        ts2.add(2);
        ts2.add(3);
        ts2.add(4);
        ts2.add(5);

        System.out.println(" Anggota dari TreeSet = " + ts2);

    }
}
