class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
          {
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> column=new HashSet<>();
            for(int j=0;j<board.length;j++)

          { if(board[i][j]!='.'&&!row.add(board[i][j])){
            return false;
          }
          if(board[j][i]!='.'&&!column.add(board[j][i])){

            return false;
          }}
          }

    for (int box = 0; box < 9; box ++) {
        HashSet<Character> smallbox=new HashSet<>();

        // This is one 3x3 box
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                int row=(box/3)*3+i;
                int column=(box%3)*3+j;

                if(board[row][column]!='.'&&!smallbox.add(board[row][column]))
                return false;
            }
        }
    }

return true;
     
        
}
}