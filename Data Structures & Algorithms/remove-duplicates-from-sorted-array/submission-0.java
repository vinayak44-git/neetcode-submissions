class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        int l=0;
        int r=1;
        while(r<nums.length)
        {
            if(nums[l]==nums[r])
                r++;
            else
                {
                    l++;
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                    r++;
                }
        }
        return l+1;
    }
}