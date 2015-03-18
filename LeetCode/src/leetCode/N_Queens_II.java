package leetCode;

public class N_Queens_II {
    public int totalNQueens(int n) {
    	if(n<=1)
    		return n;
    	int[] pos=new int[n];
    	int sum=countNum(pos, 0);
    	return sum;
    }
    public static int countNum(int[] pos,int row)
    {
    	int sum=0;
    	int n=pos.length;
    	if(row==n)
    		return 1;
    	for(int i=0;i<n;i++)
    	{
    		if(isSafe(pos, row, i))
    		{
    			pos[row]=i;
    			sum+=countNum(pos, row+1);
    		}
    	}
    	return sum;
    }
    public static boolean isSafe(int[] pos,int row,int column)
    {
    	int preC=0;
    	for(int i=0;i<row;i++)
    	{
    		preC=pos[i];
    		if(preC==column)
    			return false;
    		if((preC-i)==(column-row))
    			return false;
    		if((preC+i)==(column+row))
    			return false;
    	}
    	return true;
    }
}
