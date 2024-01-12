package Lecture31_HashMap;

public class HashNodeClass<k , v> {
    k key;
    v value;
    HashNodeClass next;

    public HashNodeClass(k key , v value){
        this.key = key;
        this.value = value;

    }
}
