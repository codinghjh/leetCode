package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] isExist=new boolean[256];
        int[] pos=new int[256];
        int count=0;
        int maxcount=0;
        int dis=0;
        for(int i=0;i<s.length();i++)
        {
        	dis=(int)s.charAt(i);
        	if(!isExist[dis])
        	{
        		isExist[dis]=true;
        		pos[dis]=i;
        		count++;
        		if(count>maxcount)
        			maxcount=count;
        	}
        	else {
        		if(count>maxcount)
        			maxcount=count;
				i=pos[dis];
				for(int j=0;j<isExist.length;j++)
				{
					isExist[j]=false;
				}
				count=0;
			}
        	
        }
        if(count>maxcount)
			maxcount=count;
        return maxcount;
    }
}
