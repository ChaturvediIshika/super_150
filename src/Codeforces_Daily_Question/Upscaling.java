package Codeforces_Daily_Question;

import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    if(i%2==0) {
                        if (j % 2 == 0)
                            str += "##";
                        else str += "..";
                    }
                    else{
                        if (j % 2 != 0)
                            str += "##";
                        else str += "..";
                    }
                }
                System.out.println(str);
                System.out.println(str);
            }
        }
    }
}
