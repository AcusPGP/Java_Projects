package oop.hash;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public HashTableExample() {

    }

    public void run() {
        Hashtable<String, Integer> temp = new Hashtable<>();

        temp.put("1", Integer.valueOf(1));
        temp.put("2", Integer.valueOf(2));
        temp.put("3", Integer.valueOf(3));
        temp.put("4", Integer.valueOf(4));

        for(Map.Entry item : temp.entrySet()) {
            System.out.println("Key: " + item.getKey() + " and Value: " + item.getValue());
        }
    }


    public static void main(String[] args) {
        HashTableExample object = new HashTableExample();
        object.run();
    }

}
