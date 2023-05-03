package Extra;

import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = "Rama";
        String s2 = "Ram";
        int c = lexi(s1, s2);
        System.out.println(c);
    }

    public static int lexi(String s1, String s2) {
        int k=0;
        while (k < s1.length() && k<s2.length()) {
            if (s1.charAt(k) > s2.charAt(k)) {
                return 1;
            }
            if (s1.charAt(k) < s2.charAt(k)) {
                return -1;
            }

            k++;
        }
        if(k<s1.length())
        {
            return 1;
        }
        if(k<s2.length())
        {
            return -1;
        }
        return 0;
    }
}




