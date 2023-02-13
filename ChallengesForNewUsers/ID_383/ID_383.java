import java.util.HashMap;
import java.util.Map;

public class ID_383 {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
        System.out.println(canConstruct(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransom = new HashMap<>();
        Map<Character, Integer> maga = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (!ransom.containsKey(c)) ransom.put(c, 1);
            else    ransom.put(c, ransom.get(c) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            if (!maga.containsKey(c)) maga.put(c, 1);
            else    maga.put(c, maga.get(c) + 1);
        }

        boolean flag = true;

        for (Map.Entry<Character, Integer> entry : ransom.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (!maga.containsKey(key) || maga.get(key) < value) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
