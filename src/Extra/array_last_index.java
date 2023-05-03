package Extra;

public class array_last_index {
    public static void main(String[] args) {
        int a[]={2,3,5,4,1,3,7,3,6};
        int v=11;
        System.out.println(find(a,v,a.length-1));
    }
    public static int find(int a[],int v,int idx)
    {
        if(idx<0)
        {
            return -1;
        }
        if(a[idx]==v)
        {
            return idx;
        }
        return find(a,v,idx-1);
    }
}
