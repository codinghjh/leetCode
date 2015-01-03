package leetCode;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
    	int max=(int)Math.min(height[0], height[height.length-1])*(height.length-1);
    	int i=0,j=height.length-1;
    	int start=height[0],end=height[height.length-1];
    	while(i<j)
    	{
    		max=Math.max(max, (j-i)*(int)Math.min(height[i], height[j]));
    		if(height[i]<height[j])
    		{
    			while(i<j&&height[i]<=start)
    				i++;
    			start=height[i];
    			
    		}
    		else {
				while(j>i&&height[j]<=end)
					j--;
				end=height[j];
			}
    	}
    	return max;
    }
}
