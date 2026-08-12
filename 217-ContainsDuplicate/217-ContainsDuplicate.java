// Last updated: 8/12/2026, 12:34:06 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int ele:nums){
            s.add(ele);
        }
        return s.size()!=nums.length;

        
    }
}