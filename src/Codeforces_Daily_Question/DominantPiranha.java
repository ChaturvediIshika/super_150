package Codeforces_Daily_Question;

import java.util.Scanner;

public class DominantPiranha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int max = Integer.MIN_VALUE;
            int ind = -2;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == max && arr[i + 1] < max) {
                    ind = i;
                    break;
                }
                if (arr[i + 1] == max && arr[i] < max) {
                    ind = i + 1;
                    break;
                }
            }

            System.out.println(ind + 1);

        }
    }
}
