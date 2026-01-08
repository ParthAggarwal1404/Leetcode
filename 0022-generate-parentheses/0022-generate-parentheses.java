class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>() ;
        rec(0,0,li, n,"");
        return li;
    }
    void rec(int close,int open , List<String> li , int n, String S)
    {
        if((open == close) && open ==n){
            li.add(S);
            return;
        }
        if(open<n){
            rec(close, open+1, li, n , S+"(");
        }
        if(open > close){
            rec(close+1,open, li,n , S+")" );
        }
    }
}