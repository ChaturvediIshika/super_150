package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> ls=new ArrayList<>();
        for(int i=1;ls.size()!=1000;i++){
            if(i%3!=0 && i%10!=3)
                ls.add(i);
        }
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            System.out.println(ls.get(n-1));
        }
    }
}
