package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Musical_Puzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            HashSet<String> hs=new HashSet<>();
            for(int i=0;i<str.length()-1;i++){
                hs.add(str.substring(i,i+2));
            }
//            System.out.println(hs);
            System.out.println(hs.size());
        }
    }
}
