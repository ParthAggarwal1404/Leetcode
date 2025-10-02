class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0, currcount = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(count));
                count++;
            }
            set.add(s.charAt(i));

            currcount = Math.max(currcount, i - count + 1);
        }
        return currcount;
    }
}
