class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int ptr1=0; 
        int ptr2=0;
        int k=0;
        while(ptr1<m && ptr2 <n){
            if(nums1[ptr1]<=nums2[ptr2]){
                nums3[k++]= nums1[ptr1++];
            }
            else{
                nums3[k++]= nums2[ptr2++];
            }
        }
            while(ptr1<m){
                nums3[k++]= nums1[ptr1++];
            }
            while(ptr2<n){
                nums3[k++]= nums2[ptr2++];
            }
            for(int i=0;i<m+n;i++){
                nums1[i]= nums3[i];
            }
                

    }
}