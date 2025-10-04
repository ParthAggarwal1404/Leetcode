class Solution {
    public int maxArea(int[] height) {
        int maxcap=0;
        int start=0;
        int end =height.length-1;
        while(start<end){
            int max = Math.min(height[start],height[end]);
            int width = end-start;
            int curcap = max* width;
            maxcap= Math.max(curcap, maxcap);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;

            } 
            
            
        }

        
        return maxcap;
    }
}