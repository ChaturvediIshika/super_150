package Assignment_4440;

import java.util.Arrays;
import java.util.Scanner;

public class Monu_Bhaiya_and_the_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int st[]=new int[n];
            int end[]=new int[n];
            for (int i=0;i<n;i++)
                st[i]= sc.nextInt();
            for (int i=0;i<n;i++)
                end[i]= sc.nextInt();
            Arrays.sort(st);
            Arrays.sort(end);
            int i=0,j=0,c=0,ans=1;
            while(i<st.length && j<end.length){
                if(st[i]<end[j]){
                    i++;
                    c++;
                }
                else {
                    j++;
                    c--;
                }
                ans=Math.max(ans,c);
            }
            System.out.println(ans);
        }
    }
}
