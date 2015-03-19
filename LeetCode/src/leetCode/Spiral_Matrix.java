package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null)
        	return null;
        List<Integer> result=new ArrayList<>();
        if(matrix.length==0)
        	return result;
        int rowStart=0,rowEnd=matrix.length-1,num=0;
        int cloStart=0,cloEnd=matrix[0].length-1;
        while(num<matrix.length*matrix[0].length)
        {
        	for(int i=cloStart;i<=cloEnd;i++)
        	{
        		result.add(matrix[rowStart][i]);
        		num++;
        	}
        	if(num>=matrix.length*matrix[0].length)
        		break;
        	for(int i=rowStart+1;i<=rowEnd;i++)
        	{
        		result.add(matrix[i][cloEnd]);
        		num++;
        	}
        	if(num>=matrix.length*matrix[0].length)
        		break;
        	for(int i=cloEnd-1;i>=cloStart;i--)
        	{
        		result.add(matrix[rowEnd][i]);
        		num++;
        	}
        	if(num>=matrix.length*matrix[0].length)
        		break;
        	for(int i=rowEnd-1;i>rowStart;i--)
        	{
        		result.add(matrix[i][cloStart]);
        		num++;
        	}
        	rowStart++;
        	rowEnd--;
        	cloEnd--;
        	cloStart++;
        }
        return result;
    }
}
