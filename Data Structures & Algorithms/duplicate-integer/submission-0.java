class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<Integer,Integer>();
        int c=1;
        for(int i=0;i<nums.length;i++)
        {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(var entry:count.entrySet())
        {
            if(entry.getValue()>1)
                return true;
        }
        return false;
    }
}