package Divide_Conquer;

public class linear_search {
    public static void main(String[] args) {
        int a[]={2,3,-1,4,7,11,9};
        int c=11;
        int q=find(a,c);
        System.out.println(q);
    }
    public static int find(int a[],int c)
    {
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==c)
            {
                return i;
            }
        }
        return -1;
    }
}
