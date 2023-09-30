package leetcode;

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        int a[]={3,1,4,2};
        int b[]={1,2,3,4};

    }
    public boolean find132pattern(int[] nums) {
        int min[]=new int[nums.length];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        Stack<Integer> s=new Stack();
        for(int j=nums.length-1;j>=0;j--){
            int ith=min[j];
            while(!s.isEmpty()&&ith>=nums[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()&&nums[j]>nums[s.peek()]){
                return true;
            }
            s.push(j);
        }
        return false;

    }


}
