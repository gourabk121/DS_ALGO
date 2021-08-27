

class Solution {
    public void sortColors(int[] nums) {
         int low=0,mid=0;
        int high=nums.length-1;
        
        while(mid<=high){
            
            switch(nums[mid]){
                case 0:
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    int temp1=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp1;
                    high--;
                    break;
            }
            
        }
       
    }
}