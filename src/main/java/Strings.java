import java.util.Arrays;

public class Strings {

    // Description: This function is used to reverse the given string
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch;
        }
        return ch;

    }
    return 0;

    // Description: This function merges two strings
    public static String StringConcatenation(String s1, String s2) {
        String s3 = s1.concat(s2);
        return s3;

    }


    // Description: The below method returns the number of vowels in the string
    // This function is tested by Unit Test : test_countVowels()
    public static int countVowels(String S1) {
        int count = 0;

        char[] Chars = S1.toCharArray();

        for (char chr : Chars) {
            if (chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E' || chr == 'i' || chr == 'I' || chr == 'o' || chr == 'O' || chr == 'u' || chr == 'U') {
                count = count + 1;
            }
        }
        return count;

    }


}