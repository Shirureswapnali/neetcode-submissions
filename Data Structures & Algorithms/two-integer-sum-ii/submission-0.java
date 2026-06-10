class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        int x;
        while(left<=right)
        {
x=numbers[left]+numbers[right];
if(x==target)
{
    return new int[]{left+1,right+1};

}else if(x<target)
{
    left++;
}else{
    right--;
}
        }
return new int[]{-1,-1};
    }

    }
