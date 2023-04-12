package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Long> hs=new HashSet<>();
        int c=0,i=0;
        while (i++<4){
            long q=sc.nextLong();
            if(!hs.contains(q))
                hs.add(q);
            else
                c++;
        }
        System.out.println(c);
    }
}
