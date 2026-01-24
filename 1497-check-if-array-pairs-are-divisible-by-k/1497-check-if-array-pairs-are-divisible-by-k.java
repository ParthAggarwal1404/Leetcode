class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] fre = new int[k];

        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            fre[rem]++;
        }

        
        if (fre[0] % 2 != 0) return false;

        
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) { 
                if (fre[i] % 2 != 0) return false;
            } else {
                if (fre[i] != fre[k - i]) return false;
            }
        }

        return true;
    }
}
