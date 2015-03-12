package leetCode;

public class Rotate_Image {
    public void rotate(int[][] matrix) {
    	int tmp=0;
        if(matrix!=null&&matrix.length!=1)
        {
        	for(int i=0;i<matrix.length;i++)
        	{
        		for(int j=i+1;j<matrix.length;j++)
        		{
        			tmp=matrix[i][j];
        			matrix[i][j]=matrix[j][i];
        			matrix[j][i]=tmp;
        		}
        	}
        	for(int j=0;j<matrix.length/2;j++)
        	{
        		for(int i=0;i<matrix.length;i++)
        		{
        			tmp=matrix[i][j];
        			matrix[i][j]=matrix[i][matrix.length-1-j];
        			matrix[i][matrix.length-1-j]=tmp;
        		}
        	}
        }
    }
}
