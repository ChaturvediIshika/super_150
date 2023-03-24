package Codeforces_Daily_Question;

import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int c=0;
        int i=0;
        while (i<n.length()){
            char r=n.charAt(i);
            if(r=='4' || r=='7')
                c++;
            i++;
        }
        if(c==4 || c==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
