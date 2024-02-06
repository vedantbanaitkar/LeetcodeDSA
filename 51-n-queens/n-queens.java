class Solution {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(0, board, res);
        return res;
    }
    public static boolean validate(char[][] board, int row, int col){
        int r=row;
        int c=col;
        while(c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            c--;
        }
        r=row;
        c=col;
        while(c>=0&&r>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            c--;
            r--;
        }
        r=row;
        c=col;
        while(c>=0&&r<board.length){
            if(board[r][c]=='Q'){
                return false;
            }
            c--;
            r++;
        }
        return true;
    }
    
    public static List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String s1 = new String(board[i]);
            res.add(s1);
        }
        return res;
    }
    
    public static void dfs(int col, char[][] board, List<List<String>> res){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++){
            if(validate(board, row, col)){
                board[row][col] = 'Q';
                dfs(col+1, board, res);
                board[row][col] = '.';
            }
        }
    }
}