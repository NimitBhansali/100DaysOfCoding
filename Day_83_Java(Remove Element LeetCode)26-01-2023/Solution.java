class Solution {
    public int removeElement(int[] nums, int val) {
       int i,s=0,n=nums.length;
        if(n==0)
            return 0;
        for(i=0;i<n;i++){
            if(nums[i]!=val){
                nums[s++]=nums[i];
            }
        }
        return s;
    }
}
