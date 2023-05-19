package Assignment_4440;

import java.util.Scanner;

public class SANKUSH_JOINS_CODING_BLOCKS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int D=0,d=0;
        for (int i=0;i<n;i++){
            if(str.charAt(i)=='D')
                D++;
        }
        System.out.println(Math.abs(n/2-D));
    }
}
