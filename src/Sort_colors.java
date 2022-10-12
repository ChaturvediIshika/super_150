import java.util.Scanner;

public class Sort_colors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        sortColors(a);
        for (int i:a) System.out.println(i);
    }
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int low =0 , mid=0;
        int high= n-1;
        while(mid<=high)
        {
            if (nums[mid]==0)
            {
                swap(nums, low , mid);
                low++;
                mid++;
            }
            else if (nums[mid]==1)
            {
                mid++;
            }
            else{
                swap(nums, mid , high);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int left, int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
