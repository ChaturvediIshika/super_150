package leetcode;

import java.util.Stack;

public class Reverse_String_II {
    public static void main(String[] args) {
        String s="aA";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String str="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
                    s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                st.push(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'||
                    s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                str+=st.pop();
            }
            else
                str+=s.charAt(i);
        }
        return str;
    }
}
