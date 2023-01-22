class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            int rem=target-s;
            if(hm.containsKey(rem)){
                int sindex=hm.get(rem);
                if(sindex==i){
                    continue;
                }
                return new int[]{i,sindex};
            }
        }
        return new int[]{};
    }
}
