package leetCode;

public class Next_Permutation {
    public void nextPermutation(int[] num) {
    	
        int temp=0;
        if(!isAscend(num,0))
        {
        	for(int j=num.length-1;j>=0;j--)
        	{
        		if(!isAscend(num, j))
        		{
        			for(int i=num.length-1;i>j;i--)
        			{
        				if(num[i]>num[j])
        				{
        					temp=num[i];
        					num[i]=num[j];
        					num[j]=temp;		
        					break;
        				}
        			}
        			int i=0;
        			for( i=j+1,j=num.length-1;i<j;i++,j--)
        			{
        				temp=num[j];
            			num[j]=num[i];
            			num[i]=temp;
        			}
        			break;
        		}
        	}
        }
        else
        {
			for(int i=0,j=num.length-1;i<j;i++,j--)
			{
				temp=num[j];
    			num[j]=num[i];
    			num[i]=temp;
			}
		}
    }
    public boolean isAscend(int[] num,int start)
    {
    	boolean isAscend=true;
        for(int i=start;i<num.length-1;i++)
        {
        	if(num[i]<num[i+1])
        	{
        		isAscend=false;
        		break;
        	}
        }
        return isAscend;
    }
}
