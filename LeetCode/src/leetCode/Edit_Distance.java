package leetCode;

public class Edit_Distance {
    public int minDistance(String word1, String word2) {
        int length1=word1.length(),length2=word2.length();
        if(length1==0)
        	return length2;
        if(length2==0)
        	return length1;
        int[][] distance=new int[length1+1][length2+1];
        for(int i=0;i<=length2;i++)
        	distance[0][i]=i;
        for(int i=0;i<=length1;i++)
        	distance[i][0]=i;
        for(int i=1;i<=length1;i++)
        	for(int j=1;j<=length2;j++)
        	{
        		if(word1.charAt(i-1)==word2.charAt(j-1))
        			distance[i][j]=distance[i-1][j-1];
        		else
        		{
					int min1=Math.min(distance[i-1][j], distance[i][j-1]);
					distance[i][j]=Math.min(distance[i-1][j-1], min1)+1;
				}
        	}
        return distance[length1][length2];
    }
}
