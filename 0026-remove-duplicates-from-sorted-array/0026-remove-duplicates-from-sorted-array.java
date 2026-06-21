class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> h1= new HashMap<>();
        int count =0;

        for(int i:nums){
            if(!h1.containsKey(i)){
                h1.put(i,1);
                nums[count++]= i;
            }
        } 
        return count;
    }
}