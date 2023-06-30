package Codeforces_Daily_Question;

import java.util.Scanner;

public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;int j=0;
        for(int k=1;k<s.length();k++)
        {
            if(Character.isLowerCase(s.charAt(k)))
                j++;
        }
        if(j==0)
        {
            char a[]=s.toCharArray();
            for(int k=0;k<a.length;k++)
            {
                if(Character.isLowerCase(a[k]))
                    a[k]=Character.toUpperCase(a[k]);
                else
                    a[k]=Character.toLowerCase(a[k]);
            }
            String qw=new String(a);
            System.out.println(qw);
        }
        else
            System.out.println(s);
    }
}
