package oop.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {

    public Map<Integer, Integer> findOccurency(int []array) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int item: array) {
            if(!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.replace(item, map.get(item) + 1);
            }
        }
        for(Map.Entry e: map.entrySet()) {
            System.out.println("Key:" + e.getKey() + " and Value: " + e.getValue());
        }
//        map.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue())).forEach(e -> System.out.println("Key:" + e.getKey() + " and Value: " + e.getValue()));
        return map;
    }

    public static void main(String[] args) {
        int []array = {1, 2, 1, 3, 1, 2};

        Occurrences o = new Occurrences();
        o.findOccurency(array);
    }

}
