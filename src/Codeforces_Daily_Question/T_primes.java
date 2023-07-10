package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class T_primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=(int)1e6+1;
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=a[1]=false;
        for (long i=2;i<=n;i++){
            if(a[(int)i]){
                for(long j=i*i;j<=n;j+=i){
                    a[(int) j]=false;
                }
            }
        }
        HashSet<Long> tp=new HashSet<>();
        for (long i=2;i<=n;i++){
            if(a[(int)i]) {
                tp.add(i * i);
            }
        }
//        System.out.println(tp);
        int t=sc.nextInt();
        while (t-->0){
            long k= sc.nextLong();
            if(tp.contains(k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
