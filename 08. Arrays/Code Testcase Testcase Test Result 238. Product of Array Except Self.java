class Solution {
    public int[] productExceptSelf(int[] nums) {
        // zeros are the problem if all elements are positive then we can multiply all elements and for each index devide by that value to get answer but due to zeros it wont work

    // approach : create two arrays one for prefix sum another one for suffix sum and in final ans array multiply these arrays by indexes to get final answer

    int length = nums.length;
    int[] prefix = new int[length];
    int[] suffix = new int[length];
    int[] ans = new int[length];

    prefix[0] = 1;
    suffix[length - 1] = 1;
    for(int i = 1;i<length;i++)
    {
        prefix[i] = prefix[i-1] * nums[i-1];
    }

    for(int i=length - 2;i>= 0;i--){
        suffix[i] = suffix[i+1] * nums[i+1];
    }

    for(int i=0;i<length;i++){
        ans[i] = prefix[i] * suffix[i];
    }

    return ans;
    }
}
