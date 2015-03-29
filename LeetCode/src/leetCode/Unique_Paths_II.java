package leetCode;

public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m=0,n=0;
    	if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)
    		return 0;
    	if(obstacleGrid[0][0]==1)
    		obstacleGrid[0][0]=Integer.MIN_VALUE;
    	else
    	{
			obstacleGrid[0][0]=1;
		}
        for(int i=1;i<obstacleGrid.length;i++)
        {
        	if(obstacleGrid[i][0]!=1)
        		obstacleGrid[i][0]=obstacleGrid[i-1][0];
        	else
        	{
				obstacleGrid[i][0]=Integer.MIN_VALUE;
			}
        }
        for(int i=1;i<obstacleGrid[0].length;i++)
        {
        	if(obstacleGrid[0][i]!=1)
        		obstacleGrid[0][i]=obstacleGrid[0][i-1];
        	else
        	{
				obstacleGrid[0][i]=Integer.MIN_VALUE;
			}
        }
        for(int i=1;i<obstacleGrid.length;i++)
        	for(int j=1;j<obstacleGrid[0].length;j++)
        	{
        		m=0;n=0;
        		if(obstacleGrid[i][j]==1)
        		{
        			obstacleGrid[i][j]=Integer.MIN_VALUE;
        			continue;
        		}
        		else
        		{
					if(obstacleGrid[i-1][j]!=Integer.MIN_VALUE)
						m=obstacleGrid[i-1][j];
					if(obstacleGrid[i][j-1]!=Integer.MIN_VALUE)
						n=obstacleGrid[i][j-1];
					obstacleGrid[i][j]=m+n;
				}
        	}
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==Integer.MIN_VALUE)
        	obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]=0;
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
