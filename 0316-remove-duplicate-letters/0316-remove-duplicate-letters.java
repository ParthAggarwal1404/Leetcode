class Solution {
    public String removeDuplicateLetters(String s) {
        int [] nums=new int[26];
        boolean [] arr= new boolean[26];
        Stack<Character> st= new Stack<>();
        for(int  i=0;i<=s.length()-1;i++){
            char ch= s.charAt(i);
            int idx= (int)(ch-'a');
            nums[idx]=i;
        }
        for(int  i=0;i<=s.length()-1;i++){
            char ch= s.charAt(i);
            int idx= (int)(ch-'a');
            if(arr[idx]==false){
                while(st.size()>0 && st.peek()>ch && nums[(int)(st.peek()-'a')]> i){
                    arr[(int)(st.peek()-'a')]=false;
                    st.pop();
                }
                st.push(ch);
                arr[idx]=true;
            }
        }
        StringBuilder sb= new StringBuilder("");
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}