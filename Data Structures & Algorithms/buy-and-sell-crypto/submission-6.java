class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right = 1;
        int sum=0;
        int len=prices.length;
        while(right<len){
            if(prices[left]>prices[right]){
                left=right;
                right++;

            }else{
                int max=prices[right]-prices[left];
                right++;
                sum=Math.max(max,sum);
            }

        }
        return sum;
        
    }
}
