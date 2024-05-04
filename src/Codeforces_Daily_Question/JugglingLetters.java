package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class JugglingLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                String s= sc.next();
                for(int j=0;j<s.length();j++){
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                }
            }
            boolean flag=true;
            for(char k: map.keySet()){
                if(map.get(k)%n!=0)
                    flag=false;
            }
            if(!flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
