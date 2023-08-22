package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> prime=FindPrime();
        int n= sc.nextInt();
        int m= sc.nextInt();
        int idx=prime.indexOf(n);
        if(prime.get(idx+1)==m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static List<Integer> FindPrime(){
        boolean a[]=new boolean[100];
        for (int i=2;i*i<a.length;i++){
            if(a[i]!=true){
                for (int j=i*i;j<a.length;j+=i)
                    a[j]=true;
            }
        }
        List<Integer> ls=new ArrayList<>();
        for (int i=2;i<a.length;i++){
            if(!a[i])
                ls.add(i);
        }
        return ls;
    }
}
