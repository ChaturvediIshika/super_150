package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Restore_the_Array {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n-1];
            for (int i=0;i<n-1;i++)
                a[i]=sc.nextInt();//0 3 4 4 3
            int c=0;
            for(int i=0;i<n-2;i++){
                if(a[i]<a[i+1] && c==0) {
                    System.out.print(a[i] + " ");
                    c=1;
                }
                else if(a[i+1]<a[i] && c==1){
                    a[i]=a[i+1];}
                System.out.print(a[i]+" ");
            }
            System.out.print(a[n-2]+" ");
            if(c==0)
                System.out.print(a[n-2]);
            System.out.println();
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
