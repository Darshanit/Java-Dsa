import java.util.*;

class HashStr {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        String str = "programming";

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print frequencies
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}