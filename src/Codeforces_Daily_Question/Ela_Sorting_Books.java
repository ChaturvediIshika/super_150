package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Ela_Sorting_Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
//            System.out.println(str);
            HashMap<Character,Integer> map=new HashMap<>();
            for (char ch='a';ch<='z';ch++)
                map.put(ch,0);
            for(int i=0;i<str.length();i++)
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            String ans="";
            for(int i=1;i<=k;i++){
                int l=n/k;
                for (char ch='a';ch<='z';ch++){
                    if(l<=0){
//                        System.out.println("lllllll");
                        ans+=ch;
                        break;
                    }
                    l--;
                    if(map.get(ch)>0){
//                        System.out.println(">0");
                        map.put(ch,map.get(ch)-1);
                    }
                    else{
                        ans+=ch;
//                        System.out.println("abcdefgh");
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
