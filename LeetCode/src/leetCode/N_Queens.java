package leetCode;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public List<String[]> solveNQueens(int n) {
    	if(n==0)
    		return null;
    	int[] pos=new int[n];
    	List<String[]> result=new ArrayList<>();
    	putQueen(pos, 0,result);
    	return result;
    }
    public static void putQueen(int[] pos,int row,List<String[]> result)
    {
    	int n=pos.length;
    	if(row==n)
    	{
        	String[] solution=new String[n];
        	for(int i=0;i<solution.length;i++)
        	{
        		char[] tmp=new char[n];
        		for(int j=0;j<n;j++)
        			tmp[j]='.';
        		tmp[pos[i]]='Q';
        		solution[i]=new String(tmp);
        	}
        	result.add(solution);
        	return;
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(isSafe(pos, row, i))
    		{
    			pos[row]=i;
    			putQueen(pos, row+1, result);
    		}
    	}
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
