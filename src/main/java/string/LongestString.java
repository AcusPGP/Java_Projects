package string;

import java.util.HashMap;
import java.util.Map;

public class LongestString {
    public Map<Character, Integer> findLongestString(String input) {
        Map<Character, Integer> map = new HashMap<>();
        int i, j;
        for (i = 0; i < input.length(); i++) {
            if (map.containsValue(input.charAt(i))) {
                map.get(map.containsKey(input.charAt(i)));
            } else {
                map.put(input.charAt(i), i);
            }
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println("Key:" + e.getKey() + " and Value: " + e.getValue());
        }
        String convert = "";
        for (i = 0; i < input.length(); i++) {
            convert += map.get(input.charAt(i));
        }
        System.out.println(convert);
        return map;
    }

    public static void main(String[] args) {
        String input = "phuch";
        LongestString s = new LongestString();
        s.findLongestString(input);
    }
}

/**
 * Key:   "p h u c p"
 * Value:  0 3 2 3 4
 */
