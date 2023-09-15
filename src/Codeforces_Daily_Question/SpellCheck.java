package Codeforces_Daily_Question;

import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str=sc.next();
            if(n!=5)
                System.out.println("NO");
            else {
                boolean T = false, i = false, m = false, u = false, r = false;
                for (int z = 0; z < str.length(); z++) {
                    if (str.charAt(z) == 'T')
                        T = true;
                    else if (str.charAt(z) == 'i')
                        i = true;
                    else if (str.charAt(z) == 'm')
                        m = true;
                    else if (str.charAt(z) == 'u')
                        u = true;
                    else if (str.charAt(z) == 'r')
                        r = true;
                }
//                System.out.println(T+" "+i+" "+m+" "+u+" "+r);
                if (T && i && m && u && r)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
