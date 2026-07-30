class Solution {
    public int[] productExceptSelf(int[] nums) {
     int [] res = new int[nums.length];
     int len = nums.length;
     Arrays.fill(res,1);
     int i=1;
     while(i<len){
        res[i]=nums[i-1]*res[i-1];
        i++;
     }   
     int prod=1;
     i = len-2;
     while(i>=0){
        prod*=nums[i+1];
        res[i]*=prod;
        i--;
     }
     return res;
    }
}  
