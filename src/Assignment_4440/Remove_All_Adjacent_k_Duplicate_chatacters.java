package Assignment_4440;

import java.util.Scanner;
import java.util.Stack;

public class Remove_All_Adjacent_k_Duplicate_chatacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        int freq[]=new int[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i) && freq[str.charAt(i)-'a']==n-1){
                while (freq[str.charAt(i)-'a']>=0){
                    st.pop();
                    freq[str.charAt(i)-'a']--;
                }
                continue;
            }
            st.push(str.charAt(i));
            freq[str.charAt(i)-'a']++;
        }
        StringBuilder s=new StringBuilder();
        while (!st.isEmpty())
            s.append(st.pop());
        System.out.println(s.reverse().toString());

    }
}
