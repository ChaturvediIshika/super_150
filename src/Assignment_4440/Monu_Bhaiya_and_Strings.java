package Assignment_4440;

import java.util.*;

public class Monu_Bhaiya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a[]=new int[26];
        for(int i=0;i<str.length();i++)
            a[str.charAt(i)-'a']++;
        Stack<Character> st=new Stack<>();
        boolean visited[]=new boolean[26];
        for(char ch:str.toCharArray()){
            if(visited[ch-'a']){
                a[ch-'a']--;
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && a[st.peek()-'a']>0){
                char c=st.pop();
                visited[c-'a']=false;
            }

                st.push(ch);
            visited[ch-'a']=true;
            a[ch-'a']--;
        }
//        System.out.println(st);
        StringBuilder s=new StringBuilder();
        while (!st.isEmpty())
            s.append(st.pop());
        System.out.println(s.reverse().toString());
    }
}
