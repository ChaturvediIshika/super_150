package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> ls=new ArrayList<>();
        if(n%2==0){
            while (n>1) {
                ls.add(2);
                n=n-2;
            }
        }
        else {
            while (n>3){
                ls.add(2);
                n=n-2;
            }
            ls.add(3);
        }
        System.out.println(ls.size());
        for (int i:ls)
            System.out.print(i+" ");
    }
}
