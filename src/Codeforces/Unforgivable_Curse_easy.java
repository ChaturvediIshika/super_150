package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Unforgivable_Curse_easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            String str2=sc.next();
//            for(int i=str2.length()-1;i>=0;i--)
//                str1+=str2.charAt(i);
//            for(int i=0;i<str1.length()-1;i++){
//                if(str1.charAt(i)==str1.charAt(i+1))
//                    c++;
//            }
            HashMap<Character,Integer> map1=new HashMap<>();
            HashMap<Character,Integer> map2=new HashMap<>();
            for (int i=0;i<n;i++){
                map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i),0)+1);
                map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
            }
            int f=0;
            for(char ch='a';ch<='z';ch++){
                if(map1.get(ch)!=map2.get(ch)) {
                    f = 1;
                    break;
                }
            }
            for(int i=0;i<Math.min(n,k);i++){
                if(n-i-1<k){
                    if(str.charAt(i)!=str2.charAt(i)){
                        f=1;
                        break;
                    }
                }
            }
//            for(int i=str2.length()-1;i>=0;i--)
//                str1+=str2.charAt(i);
//            for(int i=0;i<str1.length()-1;i++){
//                if(str1.charAt(i)==str1.charAt(i+1))
//                    c++;
//            }
            if (f==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
