class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int x=nums[i]+nums[i+2];
            int y=nums[i+1]/2;
            if(nums[i+1]%2==0 && x==y)
                cnt++;
        }
        return cnt;
    }
}