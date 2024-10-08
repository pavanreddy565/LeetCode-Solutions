class Solution {
//    boolean solve(int ind, char[][] board, int col, int row, String word) {
//         if (ind == word.length() - 1) {
//             return true;
//         }
//         if (row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != 
//         word.charAt(ind) || board[row][col] == '!')
//             return false;
//         char c=board[row][col];
//         board[row][col]='!';
        
//         boolean left=solve(ind + 1, board, col + 1, row, word); 
//         boolean right=solve(ind + 1, board, col - 1, row, word); 
//         boolean bottom=solve(ind + 1, board, col, row + 1, word); 
//         boolean top=solve(ind + 1, board, col, row - 1, word);

//         board[row][col]=c;
//         return top||bottom||right||left; 
//     }

    public boolean exist(char[][] board, String word) {
     
    int m = board.length;
        int n = board[0].length;

        int index = 0;

        // First search the first character
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(index)) {
                    if (searchNext(board, word, i, j, index, m, n))
                        return true;
                }
            }
        }

        return false;
    }

    private boolean searchNext(char[][] board, String word, int row, int col, 
    int index, int m, int n) {

        // if index reaches at the end that means we have found the word
        if (index == word.length())
            return true;

        // Checking the boundaries if the character at which we are placed is not 
        //the required character
        if (row < 0 || col < 0 || row == m || col == n || board[row][col] != 
        word.charAt(index) || board[row][col] == '!')
            return false;

        // this is to prevent reusing of the same character
        char c = board[row][col];
        board[row][col] = '!';

        // top direction
        boolean top = searchNext(board, word, row - 1, col, index + 1, m, n);
        // right direction
        boolean right = searchNext(board, word, row, col + 1, index + 1, m, n);
        // bottom direction
        boolean bottom = searchNext(board, word, row + 1, col, index + 1, m, n);
        // left direction
        boolean left = searchNext(board, word, row, col - 1, index + 1, m, n);

        board[row][col] = c; // undo change

        return top || right || bottom || left;
    }

}