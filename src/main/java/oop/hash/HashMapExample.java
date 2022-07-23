package oop.hash;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public void run() {
        HashMap<String, Integer> temp = new HashMap<>();

        temp.put("1", Integer.valueOf(1));
        temp.put("2", Integer.valueOf(2));
        temp.put("3", Integer.valueOf(3));
        temp.put("4", Integer.valueOf(4));

        for(Map.Entry item : temp.entrySet()) {
            System.out.println("Key: " + item.getKey() + " and Value: " + item.getValue());
        }
    }


    public static void main(String[] args) {
        HashMapExample object = new HashMapExample();
        object.run();
    }
}
