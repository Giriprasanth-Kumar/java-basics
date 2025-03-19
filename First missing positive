class Solution {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int res=1;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==res)
            {
                res++;
            }
        }
        return res;
    }
}
