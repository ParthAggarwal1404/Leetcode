class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x==1 || x==2){
            return 1;
        }
        
        
        long start =0;
        long end =x/2;

        while(start<=end){
            long mid = (start+ end)/2;
            if((mid* mid)> x){
                end= mid-1;
            }
            else if((mid* mid)< x){
                start = mid+1;
            }
            else if((mid* mid)== x){
                return (int)mid;
            }
        }
        return (int)end;
    }
}