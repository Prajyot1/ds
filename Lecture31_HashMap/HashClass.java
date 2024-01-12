package Lecture31_HashMap;

import java.util.ArrayList;

public class HashClass<k , v> {
    ArrayList<HashNodeClass<k,v>> bucketList;
    int count;
    int numBuckets;

    public HashClass(){
        bucketList = new ArrayList<>();
        count = 0;
        numBuckets = 5;
        // creating empty bucket
        for (int i = 0; i < numBuckets; i++) {
            bucketList.add(null);
        }
    }
    public int bucketIndex(k key){
        // hashcode calculate
        int bucketIndex = key.hashCode();

        // compression
        int index = (bucketIndex % numBuckets);
        return index;
    }
    private void reHashing() {
        ArrayList<HashNodeClass<k,v>> temp = bucketList;
        bucketList = new ArrayList<>();
        // creating empty bucket list of double size
        numBuckets *= 2;
        for (int i = 0; i < numBuckets; i++) {
            bucketList.add(null);
        }
        count = 0;
        // storing previous all elements
        for (int i = 0; i < temp.size(); i++) {
            HashNodeClass<k,v> head = temp.get(i);
            while (head != null){
                k tempKey = head.key;
                v tempValue = head.value;
                insert(tempKey,tempValue);
                head = head.next;
            }
        }

    }

    public void insert(k key , v value){
        // calculate hashCode
        int bucketIndex = bucketIndex(key);

        // storing the content at Bucketindex in head
        HashNodeClass<k,v> head = bucketList.get(bucketIndex);

        // check if link present
        while (head != null){   // only work when list alreadt present enter in block
            // if that key present
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        } // end while
        // only when key not present OR No link is present
        head = bucketList.get(bucketIndex);
        HashNodeClass<k,v> newNode = new HashNodeClass<>(key, value);
        bucketList.set(bucketIndex,newNode);
        newNode.next = head;
        count++; // since creating new node

        // cal load factor
        double load = loadFactor(count);

        if (load > 0.7){
            reHashing();
        }
    }
    public v getValue(k key){
        int bucketIndex = bucketIndex(key);
        HashNodeClass<k,v> head = bucketList.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public v remove(k key){
        int bucketIndex = bucketIndex(key);
        HashNodeClass<k,v> head = bucketList.get(bucketIndex);
        HashNodeClass<k,v> prev = null;
        while (head != null){
            if (head.key.equals(key)){
                if (prev == null){
                    bucketList.set(bucketIndex,head.next);
                    count--;
                    return head.value;
                }// end inner if
                prev.next = head.next;
                count--;
                return head.value;
            } // end outer if
            prev = head;
            head = head.next;
        }// end while
        System.out.print("error key not present/empty");
        return null;
    }
    public double loadFactor(int num){
        return ((1.0 * num)/ numBuckets);
    }
    public int size(){
        return count;
    }
    public int length(){
        return bucketList.size();
    }
}