package homeworks;
import java.util.Arrays;

public class Homework {
    public static int getBiggestNum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];

        // O(n log(n))
    }

    public static boolean isPalindrome(String word){
        String res = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            res = ch + res;
        }
        return res.equals(word);

        //Time: O(n)   Space: O(n)

    }

    public static void main(String[] args) {

        System.out.println(getBiggestNum(new int[]{3,12, 345, 2, 34, 54, 78, 87, 13, 20}));

        System.out.println(isPalindrome("abcddcba"));

    }
}
