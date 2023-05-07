package hashsetlatihan;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        String name[] = {
            new String("Indobeisa"),
            new String("Tanah Airku"),
            new String("Tanah Tumpah Darahku"),
            new String("Tanah Airku")
        };

        Set s = new HashSet<>();
        for (int i=0; i<name.length; i++){
            if (!s.add(name[i]))
                System.out.println("terdeteksi duplikat :" +name[i]);

        System.out.println(s.size()+" Terdeteksi kata yang berbeda : "+s);

        }
    }
}