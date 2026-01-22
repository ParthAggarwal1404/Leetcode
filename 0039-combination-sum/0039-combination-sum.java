class Solution {
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        List<List<Integer>> res = new ArrayList<>();//bag
        List<Integer> slate = new ArrayList<>();
        helper(candidate , 0 , target , 0 , slate , res);
        return res;
    }
    private void helper(int[] candidate, int index , int target , int sum, List<Integer> slate, List<List<Integer>> res){

        if(sum==target){
            res.add(new ArrayList<>(slate));
            return ;
        }
        if(index>= candidate.length){
            return ;
        }
        if(sum>target){
            return ;//bound
        }
        //we don't take the no.
        helper(candidate, index+1, target, sum,slate,res);
        //we take no.    7[2 2 3]
        sum+=candidate[index];
        slate.add(candidate[index]);
        helper(candidate,index,target,sum,slate,res);
        //[2,2]
        slate.remove(slate.size()-1);
        //make a choice and undo that
        sum-=candidate[index];

        // for(int i=index;i<candidate.length;i++){
        //     slate.add(candidate[index]);
        //     helper(candidate,index,target,sum + candidate[i],slate,res);
        //     slate.remove(slate.size()-1);
        // }
    }

}