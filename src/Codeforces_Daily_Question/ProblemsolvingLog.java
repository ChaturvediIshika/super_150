package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemsolvingLog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            int cnt=0;
            for(char k:map.keySet()){
                if((k-'A'+1)<=map.get(k))
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
