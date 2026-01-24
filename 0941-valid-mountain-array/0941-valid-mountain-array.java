class Solution {
    public boolean validMountainArray(int[] arr) {
        int n= arr.length;
        if(n==1 || n==2){
            return false;
        }
        int start=0;
        
        while(start<n-1 && arr[start]<arr[start +1]){
            
            start++;
        }
        if(start==0 || start==n-1){
            return false;
        }
        while(start<n-1 && arr[start]>arr[start+1]){
            start++;
        }
        if(start==n-1){
            return true;
        }
        else {
            return false;
        }
    }
}