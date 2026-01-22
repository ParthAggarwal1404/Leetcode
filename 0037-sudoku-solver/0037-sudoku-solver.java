class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
        
    }
    private boolean helper(char[][] board, int row,int col){
        if(row==9){
            return true;
        }
        if(col ==9){
            return helper(board, row+1,0);
        }
        if(board[row][col]!='.'){
            return helper(board, row, col+1);
        }
        for(char ch ='1';ch<='9';ch++){
            if(isValid(board, row, col, ch)){
                board[row][col]=ch;
                if(helper(board, row,col+1) ==true){
                    return true;
                }
                board[row][col]= '.';
            }

        }
        return false;
    }
    private boolean isValid(char[][] board , int i, int j, char ch){

        int row= i- i%3;
        int col= j- j%3;
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(board[row+x][col+y]==ch){
                    return false;
                }
            }
        }
        for(int x=0;x<9;x++){
            if(board[x][j]==ch){
                return false;
            }
        }
        for(int y=0;y<9;y++){
            if(board[i][y]==ch){
                return false;
            }
        }
        return true;

    }
}