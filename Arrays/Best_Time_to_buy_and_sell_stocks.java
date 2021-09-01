class Solution {
    public int maxProfit(int[] nums) {
        
        int maxp=0;
            int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            int nmax=nums[i]-min;
            if(maxp<nmax){
                maxp=nmax;
            }
            
        }
        return maxp;
    }
    
}
