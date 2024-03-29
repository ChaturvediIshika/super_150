package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class VladandShapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashSet<Integer> hs=new HashSet<>();
            boolean b=false;
            while (n-->0){
                String s= sc.next();
                int one=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='1')
                        one++;
                }
                if(one==0)
                    continue;
                if(hs.contains(one))
                    b=true;
                else
                    hs.add(one);
            }
            if(b)
                System.out.println("SQUARE");
            else
                System.out.println("TRIANGLE");
        }
    }
}
