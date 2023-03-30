package Codeforces_Daily_Question;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int t=sc.nextInt();
        String str=sc.next();
        String ch[]=str.split("");
        str="";
//        for (int i=0;i<n;i++)
//            System.out.print(ch[i]+" ");
        while (t-->0){
            for (int i=0;i<n-1;i++){
                if(ch[i].equals("B") && ch[i+1].equals("G")){
                    ch[i]="G";
                    ch[i+1]="B";
                    i++;
                }
            }
        }
//        System.out.println();
//        for (int i=0;i<n;i++)
//            System.out.print(ch[i]+" ");
        for (int i=0;i<n;i++)
            str+=ch[i];
        System.out.println(str);
    }
}
