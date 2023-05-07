package hashsetlatihan;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        HashSet hs = new HashSet<>(5, 0.5f);
        System.out.println(hs.add("satu"));
        System.out.println(hs.add("dua"));
        System.out.println(hs.add("tiga"));
        System.out.println(hs.add("tiga"));
        System.out.println(hs.add("empat"));
        System.out.println(hs.add("lima"));

        System.out.println(hs);


        Boolean b =  hs.add("satu");
        System.out.println("Duplicate item allowed =" + b);
        System.out.println(hs);
    }
    
}
