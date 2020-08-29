/* Tiling
  Refer:https://www.geeksforgeeks.org/tiling-problem/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Tiling {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		    
		    int w=sc.nextInt();
		    int [] dp=new int[w+1];
		    
		    dp[1]=1;
		    dp[2]=2;
        
		    for(int i=3;i<dp.length;i++){
		        dp[i]=dp[i-1]+dp[i-2];
		    }
		    System.out.println(dp[w]);
		    
		
	}
}
