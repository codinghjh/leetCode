package leetCode;

public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int count=1,start=0,end=n-1;
        while(count<=n*n)
        {
        	for(int i=start;i<=end;i++)
        	{
        		result[start][i]=count;
        		count++;
        	}
        	if(count>n*n)
        		break;
        	for(int i=start+1;i<=end;i++)
        	{
        		result[i][end]=count;
        		count++;
        	}
        	if(count>n*n)
        		break;
        	for(int i=end-1;i>=start;i--)
        	{
        		result[end][i]=count;
        		count++;
        	}
        	if(count>n*n)
        		break;
        	for(int i=end-1;i>start;i--)
        	{
        		result[i][start]=count;
        		count++;
        	}
        	start++;
        	end--;
        }
        return result;
    }
}
