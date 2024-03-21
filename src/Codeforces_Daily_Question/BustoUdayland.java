package Codeforces_Daily_Question;

import java.util.Scanner;

public class BustoUdayland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean f=false;
        String a[]=new String[n];
        String s="";
        int p=0;
        for(int i=0;i<n;i++){
            a[i]= sc.next();
            if(f==false && a[i].contains("OO")){
                f=true;
                s=a[i];
                p=i;
            }
        }
        if(!f)
            System.out.println("NO");
        else{
            System.out.println("YES");
            for(int i=0;i<n;i++){
                if(i==p) {
                    s=s.replaceFirst("OO","++");
                    System.out.println(s);
                }
                else
                    System.out.println(a[i]);
            }
        }
    }
}
