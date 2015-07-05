package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sudoku_Solver {
    public void solveSudoku(char[][] board) {
       List<Set<Character>> rowList=new ArrayList<>();
       List<Set<Character>> cloumnList=new ArrayList<>();
       List<Set<Character>> sudokuList=new ArrayList<>();
       Set<Character> setAll=new HashSet<>();
       boolean isContinue=true;

       for(int i=0;i<10;i++)
       {
    	   setAll.add((char)i);
       }
       
       for(int i=0;i<9;i++)
       {
           Set<Character> setTemp=new HashSet<>();
    	   setTemp.addAll(setAll);
    	   for(int j=0;j<9;j++)
    	   {
    		   if(board[i][j]!='.')
    			   setTemp.remove(board[i][j]);
    	   }
    	   rowList.add(setTemp); 
       }
       for(int i=0;i<9;i++)
       {
           Set<Character> setTemp=new HashSet<>();
    	   setTemp.addAll(setAll);
    	   for(int j=0;j<9;j++)
    	   {
    		   if(board[j][i]!='.')
    			   setTemp.remove(board[j][i]);
    	   }
    	   cloumnList.add(setTemp);
       }
       for(int i=0;i<3;i++)
       {
    	   for(int j=0;j<3;j++)
    	   {
    		   Set<Character> setTemp=new HashSet<>();
        	   setTemp.addAll(setAll);
        	   for(int k=i*3;k<i*3+3;k++)
        	   {
        		   for(int l=j*3;l<j*3+3;l++)
        		   {
        			   if(board[l][k]=='.')
        				   setTemp.remove(board[l][k]);
        		   }
        	   }
        	   sudokuList.add(setTemp);
    	   }   
       }
       
       while(isContinue)
       {
    	   isContinue=false;
    	   for(int i=0;i<9;i++)
    		   for(int j=0;j<9;j++)
    		   {
    			   if(board[i][j]=='.')
    			   {
    				   Set<Character> set1=rowList.get(i);
    				   Set<Character> set2=cloumnList.get(j);
    				   Set<Character> set3=sudokuList.get((i/3+j/3));
    				   Set<Character> result=new HashSet<>();
    				   result.addAll(set1);
    				   for(char c:result)
    				   {
    					   if(!(set2.contains(c)&&set3.contains(c)))
    						   result.remove(c);
    				   }
    				   if(result.size()==1)
    				   {
    					   for(int z=0;z<10;z++)
    					   {
    						   if(result.contains((char)z))
    						   {
    							   board[i][j]=(char)z;
    							   isContinue=true;
    							   break;
    						   }
    					   }
    				   }
    			   }
    		   }
       }
    }
    
}
