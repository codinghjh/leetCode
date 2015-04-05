package leetCode;

public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,col=matrix[0].length;
        if(matrix==null||matrix.length==0)
        	return false;
        if(matrix[0][0]==target)
        	return true;
        if(matrix[0][0]>target)
        	return false;
        int rowPos=0;
        int i=0;
        for(i=1;i<row;i++)
        {
        	if(matrix[i][0]>target)
        	{
        		rowPos=i-1;
        		break;
        	}
        	else if(matrix[i][0]==target)
        	{
				return true;
			}
        }
        if(i==row)
        rowPos=row-1;
        
        for(i=1;i<col;i++)
        {
        	if(matrix[rowPos][i]==target)
        		return true;
        }
        return false;
    }
}
