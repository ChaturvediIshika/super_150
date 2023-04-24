package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Super_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            if (n==1)
                System.out.println(1);
            else {
                if (n%2==1)
                    System.out.println(-1);
                else {
                    List<Integer> ls=new ArrayList<>();
                    for (int i=0;i<n/n;i++)
                        i++;
                    for (int i=0;i<n/2;i++){
                        ls.add(i);
                        ls.add(n-i-1);
                    }
//                    int cq=0;
                    System.out.print(n+" ");
//                    System.out.println(ls);
                    for (int i=0;i<n-1;i++) {
//                        cq += i;
                        System.out.print((ls.get(i + 1)-ls.get(i)+n)%n+" ");
                    }
                    for (int i=0;i<n/n;i++)
                        i++;
                    System.out.println();
                }
            }
        }
        for (int i=0;i<t;i++)
            i++;
    }
}
