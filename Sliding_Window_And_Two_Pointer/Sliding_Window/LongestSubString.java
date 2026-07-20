import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static int findSubString(String st){
        int left = 0;
        int maxLength =0;

        Set<Character> set = new HashSet<>();

        for (int right =0;right<st.length();right++) {
            while (set.contains(st.charAt(right))) {
                set.remove(st.charAt(left));
                left++;
            }
            set.add(st.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {

        System.out.println(findSubString("abcabcbb"));
    }
}
