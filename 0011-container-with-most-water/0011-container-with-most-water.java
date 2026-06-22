class Solution {
    public int maxArea(int[] height) {
        int maxheight=0;
        int start=0;
        int end= height.length-1;
        while(start<end){
            int vol = (end-start)*(Math.min(height[start],height[end]));
           
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            maxheight = Math.max(vol, maxheight); 
            
            
        }
        return maxheight;
    }
}