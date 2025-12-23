class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int i: nums){

            if(hp.containsKey(i)){
                hp.put(i , hp.get(i) +1);
            }
            else{
                hp.put(i,1);
            }
        }
        for(int key : hp.keySet()){
            if(hp.get(key)> 1){
                return true;
            }
        }
        return false;
    }
}