package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class DoorsandKeys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s= sc.next();
            HashSet<Character> hs=new HashSet<>();
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='R' && !hs.contains('r'))
                    flag=false;
                else if(s.charAt(i)=='B' && !hs.contains('b'))
                    flag=false;
                else if(s.charAt(i)=='G' && !hs.contains('g'))
                    flag=false;
                else
                    hs.add(s.charAt(i));
                if(flag==false)
                    break;
            }
            if(!flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
