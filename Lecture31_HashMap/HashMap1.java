package Lecture31_HashMap;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        map.put("prajyot" , 1);
        map.put("gawad" , 3);
        map.put("gawad1" , 55);
        map.put("gawad2" , 0);

        System.out.println(map.get("gawad"));
        System.out.println(map.size());
        System.out.println(map.containsKey("prajyot"));
        System.out.println(map.containsKey("prajy"));

        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.print(key+" ");
        }
    }
}
