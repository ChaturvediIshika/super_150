package Codeforces_Daily_Question;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[]y=new int[x*2];
        int count=0;
        for(int i=0;i<x*2;i++){
            y[i]=sc.nextInt();	}
        for(int i=0;i<x*2;i=i+2){
            for(int j=0;j<x*2;j++){
                if(y[i]==y[j] && j%2==1){count++;}
            }	}
        System.out.println(count);
    }
}
