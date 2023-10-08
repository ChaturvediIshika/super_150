package MetaHackerUp;

import java.util.Arrays;
import java.util.Scanner;

public class HereComesSantaClaus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k=1;
        while (k<=t){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextLong();
            Arrays.sort(a);
            if(n>5 && (a[0]+a[2])/2==a[1] && (a[n-1]+a[n-3])/2==a[n-2]){
                System.out.println("Case #"+k+": "+((a[n-2]-a[1])));
            }
            else if((a[0]+a[2])/2==a[1])
                System.out.println("Case #"+k+": "+((a[n-1]-a[1])));
            else if(n==4 && (a[n-1]+a[n-3])/2==a[n-2])
                System.out.println("Case #"+k+": "+((a[n-2]-a[0])));
            else System.out.println("Case #"+k+": "+((a[n-1]+a[n-2])/2.0-(a[0]+a[1])/2.0));
            k++;
        }
    }
}
