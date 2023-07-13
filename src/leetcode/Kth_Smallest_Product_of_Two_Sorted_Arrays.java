package leetcode;

public class Kth_Smallest_Product_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int a[]={-4,-2,0,3};
        int b[]={2,4};
        int k=6;
        System.out.println(product(a,b,k));
    }
    public static long product(int a[],int b[],int k){
        long si=(long)-1e10;
        long ei=(long) 1e10;
        long ans = 0;
        while (si<=ei){
            long mid=(si+ei)/2;
            if(countProduct(a,b,mid)>=k){
                ans=mid;
                ei=mid-1;
            }
            else {
                si=mid+1;
            }
        }
        return ans;
    }

    public static long countProduct(int[] a, int[] b, long pro) {
        long ans=0;
        for(int ei:a){
            if(ei>=0) {
                long count = 0;
                int lo = 0;
                int hi = b.length - 1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if ((long) (ei) * b[mid] <= pro) {
                        count = mid + 1;
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                ans+=count;
            }
            else{
                long count = 0;
                int lo = 0;
                int hi = b.length - 1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if ((long) (ei) * b[mid] <= pro) {
                        count = b.length-mid;
                        hi = mid -1;
                    } else {
                        lo = mid + 1;
                    }
                }
                ans+=count;
            }
        }
        return ans;
    }

}
