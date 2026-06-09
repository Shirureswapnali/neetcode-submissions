class Solution {
    public int findMin(int[] nums) {
    int n=nums.length;
    int x=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
x=Math.min(nums[i],x);
    }
     return x;
    }
}
