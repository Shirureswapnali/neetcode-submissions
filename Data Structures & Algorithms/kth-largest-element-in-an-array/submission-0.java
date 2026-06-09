class Solution {
    public int findKthLargest(int[] nums, int k) {
      int n=nums.length;
      int temp;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n-i-1;j++)
        {
            if(nums[j+1]>nums[j])
            {
                temp=nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }

     }
        return nums[k - 1];

    }
}
