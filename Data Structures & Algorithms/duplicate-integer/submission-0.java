class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>mp=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(mp.contains(nums[i]))
            {
                return true;
            }
            mp.add(nums[i]);
        }
        return false;
    }
}