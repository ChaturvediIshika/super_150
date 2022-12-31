package leetcode;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};
        System.out.println(mountain(arr));
    }
    public static int mountain(int arr[]){
        int l=0,h=arr.length-1,mid=0;
        while (l<=h){
            mid=l+(h-l)/2;
            int q=check(arr,mid);
            if(q==0){
                return mid;
            }
            else if(q==1)
                h=mid-1;
            else if(q==2)
                l=mid+1;
        }
        return mid;
    }
    public static int check(int arr[],int mid){
        for(int i=0;i<mid;i++){
            if(arr[i]>arr[i+1])
                return 1;
        }
        for (int i=mid;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                return 2;
        }
        return 0;
    }
}
