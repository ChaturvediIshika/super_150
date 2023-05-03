package Extra;

public class min_Index {
    public static void main(String[] args) {
        int a[]={2,3,-1,4,7,11,9};
        int q=find(a);
        System.out.println(q);
    }
    public static int find(int a[])
    {
        int p=0,min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
               min=a[i];
               p=i;
            }
        }
        return p;
    }
}
