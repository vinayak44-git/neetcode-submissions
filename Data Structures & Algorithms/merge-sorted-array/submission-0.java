class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=n-1;
        for(int i=nums1.length-1;i>=m;i--)
        {
            nums1[i]=nums2[c--];
        }
        Arrays.sort(nums1);
    }
}