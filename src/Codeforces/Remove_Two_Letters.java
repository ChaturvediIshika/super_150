package Codeforces;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_Two_Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            HashSet<String> set=new HashSet<>();
            int cnt=n-1;
//            for(int i=0;i<n-1;i++){
//                set.add(str.substring(0,i)+str.substring(i+2,n));
//            }
            for(int i=1;i<n-1;i++){
                char ch=str.charAt(i);
                if(str.charAt(i-1)==str.charAt(i+1))
                    cnt--;
            }
            System.out.println(cnt);
        }
    }
}
