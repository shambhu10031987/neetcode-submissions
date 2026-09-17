class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();

            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.' &&!row.add(board[i][j]))
                    return false;
                if(board[j][i]!='.'&&!col.add(board[j][i]))
                    return false;
            }
        }
        for(int boxRow=0;boxRow<9;boxRow+=3){
            for(int boxCol=0;boxCol<9;boxCol+=3){
                HashSet<Character> boxhs=new HashSet<>();
                for(int i=0;i<3;i++){
                    for (int j=0;j<3;j++){
                        char val = board[boxRow+i][boxCol+j];
                        if(val!='.'&&!boxhs.add(val))
                            return false;
                    }
                }
            }
        }
        return true;

    }

}