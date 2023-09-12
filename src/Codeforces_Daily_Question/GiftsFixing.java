package Codeforces_Daily_Question;

import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            long am=1000_000_000;
            long b[]=new long[n];
            long bm=1000_000_000;
            for (int i=0;i<n;i++){
                a[i]=sc.nextLong();
                am=Math.min(a[i],am);
            }
            for (int i=0;i<n;i++){
                b[i]=sc.nextLong();
                bm=Math.min(b[i],bm);
            }
            long c=0;
            for (int i=0;i<n;i++){
                c+=Math.max(a[i]-am,b[i]-bm);
            }
            System.out.println(c);
        }
    }
}
