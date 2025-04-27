# april27_2025
The problem that i solved today in leetcode

1.Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.

Code:
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
