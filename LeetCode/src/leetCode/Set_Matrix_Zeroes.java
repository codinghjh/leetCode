package leetCode;

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        boolean[] need=new boolean[col];
        boolean isExsit=false;
        for(int i=0;i<row;i++)
        {
        	isExsit=false;
        	for(int j=0;j<col;j++)
        	{
        		if(matrix[i][j]==0)
        		{
        			isExsit=true;
        			need[j]=true;
        		}
        	}
        	if(isExsit)
        	{
        		for(int k=0;k<col;k++)
        			matrix[i][k]=0;
        	}
        }
        for(int i=0;i<col;i++)
        {
        	if(need[i])
        	{
        		for(int j=0;j<row;j++)
        			matrix[j][i]=0;
        	}
        }
    }
}
