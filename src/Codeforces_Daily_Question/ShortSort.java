package Codeforces_Daily_Question;

import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String k="abc";
        sc.nextLine();
        while (t-->0){
            String s= sc.nextLine();
            int c=0;
            for(int i=0;i<3;i++){
                if(s.charAt(i)!=k.charAt(i))
                c++;
            }
            if(c==0 || c==2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
