package CODECHEF;

import java.util.Scanner;

public class Divide_Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (sum % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
//            int l=a[0],r=sum,flag=0;
//            while (l<r){
//                int mid=(l+r)/2;
//                if(find(mid,a,sum)){
//                    System.out.println("YES");
//                    flag=1;
//                    break;
//                }
//                else{
//                    l=mid+1;
//                }
//            }
//            if(flag==0)
//                System.out.println("NO");
//        }
//    }
//    public static boolean find(int mid,int a[],int sum){
//        int page=0;
//        for(int i=0;i<a.length-1;i++){
//            page+=a[i];
//            if(page%2==0 && (sum-page)%2==0)
//                return true;
//            if(page%2!=2 && (sum-page%2!=0))
//                return true;
//        }
//        return false;
        }
    }
}
