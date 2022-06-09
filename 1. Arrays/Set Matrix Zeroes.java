/*  Problem -  Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
  You must do it in place.
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = 1;
        
        for(int i=0; i<row ; i++){
            if(matrix[i][0] == 0)   col0=0; // This must be written earlier here only! eg- {[1,1,0][1,1,1]}
            for(int j=1; j<col ; j++){                
                if(matrix[i][j]==0) {
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }              
            }
        }
        
        for(int i = row-1 ; i>=0 ; i--){            
            for(int j=col-1; j>=1 ; j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
            if(col0 == 0 ) matrix[i][0] = 0; //This must be written after inner for loop only here
        }
        
        
    }
}
