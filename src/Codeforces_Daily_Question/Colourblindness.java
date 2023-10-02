package Codeforces_Daily_Question;

import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s1=sc.nextLine();
            String s2= sc.nextLine();
            boolean f=false;
            for (int i=0;i<n;i++){
                if((s1.charAt(i)=='R' && s2.charAt(i)!='R')||(s2.charAt(i)=='R' && s1.charAt(i)!='R')){
                    f=true;
                    break;
                }
            }
            if (f)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
