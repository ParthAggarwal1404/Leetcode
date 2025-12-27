class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int i:nums){
            hp.put(i, hp.getOrDefault(i,0) +1);

        }

        for(int key :hp.keySet()){
            if(hp.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}