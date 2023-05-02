package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BAN_BAN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str="";
            for (int i=0;i<n;i++)
                str+="BAN";
            List<Integer> ls=new ArrayList<>();
            int c=0;
            for(int i=1,j=str.length()-1;i<j;i++,j--){
                if(str.charAt(i)=='A' && str.charAt(j)=='N'){
                    ls.add(i+1);
                    ls.add(j+1);
                    c++;
                }
            }
            System.out.println(c);
            for (int q:ls)
                System.out.print(q+" ");
            System.out.println();
        }
    }
}
