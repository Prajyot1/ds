package Lecture31_HashMap;

public class HashClassUse {
    public static void main(String[] args) {
        HashClass<String , Integer> map = new HashClass<>();

        for (int i = 0; i < 40; i++) {
            map.insert("abc"+i , i);
            System.out.print("abc"+i +" " + map.bucketIndex("abc"+i)+" "+ map.length());
            System.out.println();
        }
        System.out.println(map.getValue("abc5"));
        System.out.println(map.getValue("abc0"));
        System.out.println(map.getValue("abc20"));
        System.out.println(map.getValue("abc40"));

        map.remove("abc"+ 0);
        map.remove("abc"+ 10);
        map.remove("abc"+ 25);
        map.remove("abc"+ 40);
        System.out.println();

        for (int i = 0; i < 40; i++) {
            System.out.print("abc"+i+" : " + map.getValue("abc"+i));
            System.out.println();
        }
    }
}
