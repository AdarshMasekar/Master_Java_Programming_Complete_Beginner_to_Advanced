class Solution {
    public boolean containsDuplicate(int[] nums) {
        // sort and check adjecent elements are equal if yes return true else return false;
        // add elements in a set while adding check if it is already present if yes return true else false
        HashSet<Integer> set  = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
