package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class NumberReplacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            String s=sc.next();
            HashMap<Integer,Character> map=new HashMap<>();
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(!map.containsKey(a[i]))
                    map.put(a[i],s.charAt(i));
                else{
                    if(map.get(a[i])!=s.charAt(i)){
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
