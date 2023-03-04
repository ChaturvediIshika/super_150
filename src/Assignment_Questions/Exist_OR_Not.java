package Assignment_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class Exist_OR_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
                set.add(sc.nextInt());
            int q= sc.nextInt();
            while (q-->0){
                int r=sc.nextInt();
                if(set.contains(r))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
