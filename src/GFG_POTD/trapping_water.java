package GFG_POTD;

public class trapping_water {
    public static void main(String[] args) {
        int a[]={3,0,0,2,0,4};
        System.out.println(trap(a));
    }
    public static long trap(int a[]){
        long sum=0;
        int l[]=new int[a.length];
        int r[]=new int[a.length];
        l[0]=a[0];
        r[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            l[i]=Math.max(l[i-1],a[i]);
        }
        for (int i=a.length-2;i>=0;i--){
            r[i]=Math.max(r[i+1],a[i]);
        }
        for (int i=1;i<a.length-1;i++){
            sum+=Math.min(l[i],r[i])-a[i];
        }
        return sum;
    }
}
