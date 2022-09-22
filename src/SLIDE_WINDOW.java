public class SLIDE_WINDOW {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=3;
        System.out.println(window(a,k));
    }
    public static int window(int[] a,int k)
    {
        int sum=0,res=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        for(int i=k;i<a.length;i++)
        {
            sum+=a[i];
            sum-=a[i-k];
            if(sum>res)
            {
                res=sum;
            }
        }
        return res;
    }
}
