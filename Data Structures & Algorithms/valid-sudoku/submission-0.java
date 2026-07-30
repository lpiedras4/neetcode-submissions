class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Validate rows
        for(int i=0;i<9;i++){
            HashSet <Character> set = new HashSet <>();
            for(int j=0;j<9;j++){
                char item = board[i][j];
                if(set.contains(item)){
                    return false;
                }else if(item!='.'){
                    set.add(item);
                }
            }
        }
        //Validate columns
         for(int i=0;i<9;i++){
            HashSet <Character> setC = new HashSet <>();
            for(int j=0;j<9;j++){
                char item = board[j][i];
                if(setC.contains(item)){
                    return false;
                }else if(item!='.'){
                    setC.add(item);
                }
            }
        }


        //Validate boxes == nested for loop
        int[][] starts = {
            {0, 0}, {0, 3}, {0, 6},
            {3, 0}, {3, 3}, {3, 6},
            {6, 0}, {6, 3}, {6, 6}
        };
        
        for(int[]start:starts){
            int i = start[0];
            int j = start[1];
            Set <Character> s = new HashSet<>();

            for(int row = i ; row< i+3 ;row++){
                for(int col=j;col<j+3;col++){
                    char item = board[row][col];
                    if(s.contains(item)){
                        return false;
                    }else if(item!='.'){
                        s.add(item);
                    }
                }

            }

        }


    return true;
    }
}
