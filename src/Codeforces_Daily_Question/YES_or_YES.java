package Codeforces_Daily_Question;

import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next().toLowerCase();
            if(str.equals("yes"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
