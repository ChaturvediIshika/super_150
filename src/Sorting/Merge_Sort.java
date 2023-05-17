package Sorting;


public class Merge_Sort {
    public static void main(String[] args) {
        int a[]={5,3,4,2,1};
        int ans[]=Sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(ans[i]+" ");
    }
    public static int[] Sort(int a[],int l,int r){
        if(l==r){
            int k[]=new int[1];
            k[0]=a[l];
            return k;
        }
        int mid=(l+r)/2;
        int s1[]=Sort(a,l,mid);
        int s2[]=Sort(a,mid+1,r);
        int s[]=new int[s1.length+s2.length];
        merge(s1,s2,s);
        return s;
    }
    public static void merge(int s1[],int s2[],int s[]){
        int i=0,j=0,k=0;
        while (i<s1.length && j<s2.length){
            if(s1[i]<s2[j]){
                s[k]=s1[i];
                i++;k++;
            }
            else{
                s[k]=s2[j];
                j++;
                k++;
            }
        }
        while(i<s1.length){
            s[k]=s1[i];
            i++;
            k++;
        }
        while(j<s2.length){
            s[k]=s2[j];
            j++;
            k++;
        }
    }
}
