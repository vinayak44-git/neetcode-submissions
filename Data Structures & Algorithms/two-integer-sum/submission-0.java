class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> count=new HashMap<>();
        int arr[]=new int[2];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(count.containsKey(diff))
            {
                return new int[]{count.get(diff),i};
            }
            count.put(nums[i],i);
        }
        return new int[0];

    }
}
