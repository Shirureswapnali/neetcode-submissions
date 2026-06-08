class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>mp=new HashSet<>();
 for(int i=0;i<n;i++)
 {
    if(mp.contains(nums[i]))
    {
        return nums[i];
    }
    mp.add(nums[i]);
 }
 return -1;
}
}

