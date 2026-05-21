class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows=new int[9];
        int[] col=new int[9];
        int[] squares=new int[9];
        //checkking whether any row or col contains repitive digit
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int val=board[i][j]-'1';
                if((rows[i] & (1<<val))>0 || (col[j] & (1<<val)) >0 || (squares[(i/3)*3 + (j/3)] &(1<<val))>0){
                    return false;
                }
                rows[i] |= (1 << val);
                col[j] |= (1 << val);
                squares[(i / 3) * 3 + (j / 3)] |= (1 << val);

            }
            
        } 
        return true;
    }
}