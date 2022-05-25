package dynamicProgramming;
import java.io.*;
import java.util.*;

public class GoldMining {

	    private static void helper(int[][] arr,int n,int m)
	    {
	        int [][]dp = new int[n][m];
	        for(int i=0;i<n;i++)
	        {
	            dp[i][m-1] = arr[i][m-1];
	        }
	        for(int j=m-2;j>=0;j--)
	        {
	            for(int i=0;i<n;i++)
	            {
	                if(i>0 && i<n-1){
	                dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));
	                }
	                else if(i==n-1)
	                {
	                    dp[i][j]= arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
	                }
	                else{
	                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
	                }
	            }
	        }
	        int ans=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            ans=Math.max(ans,dp[i][0]);
	        }
	        System.out.print(ans);
	    }
	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int arr[][] = new int[n][m];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        sc.close();
	        helper(arr,n,m);
	    }

	}

