class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int profit=0;
        int temp=0;
        while(r<prices.length)
        {
            if(prices[r]<prices[l])
                {
                    l=r;
                }
            else
            {
                temp=prices[r]-prices[l];
                if(temp>profit)
                    profit=temp;
                r++;
            }
        }
        return profit;
    }
}
