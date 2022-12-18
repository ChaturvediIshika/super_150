package leetcode;

import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s="ab##";
        String t="c#d#";
        System.out.println(compare(s,t));
    }
    public static boolean compare(String s,String t){
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st1.isEmpty() &&s.charAt(i)=='#')
                st1.pop();
            if(s.charAt(i)!='#')
                st1.push(s.charAt(i));
        }
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(!st2.isEmpty() &&t.charAt(i)=='#')
                st2.pop();
            if(t.charAt(i)!='#')
                st2.push(t.charAt(i));
        }
        String str1="",str2="";
        while (!st1.isEmpty())
            str1+=st1.pop();
        while (!st2.isEmpty())
            str2+=st2.pop();
        return str1.equals(str2);
    }
}
