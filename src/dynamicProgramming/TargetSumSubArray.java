package dynamicProgramming;

import java.io.*;
import java.util.*;
public class TargetSumSubArray {

// Complexity -- > O(N * Target)
	    private static void helper(int[] arr,int n,int t)
	    {
	        boolean dp[][] = new boolean[n+1][t+1];
	       
	        for(int i=0;i<dp.length;i++)
	        {
	            for(int j=0;j<dp[0].length;j++)
	            {
	                if(i==0 && j==0)
	                {
	                    dp[i][j] = true;
	                }
	                else if(i==0)
	                {
	                    dp[i][j] = false;
	                }
	                else if(j==0)
	                {
	                    dp[i][j] = true;
	                }
	                else{
	                    if(dp[i-1][j]==true)
	                    {
	                        dp[i][j] = true;
	                    }
	                    else{
	                        int tar = arr[i-1];
	                        if(j>=tar && dp[i-1][j-tar]==true)
	                        {
	                            dp[i][j] = true;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.print(dp[dp.length-1][t]);
	        
	    }
	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        int tar = sc.nextInt();
	        sc.close();
	        helper(arr,n,tar);
	    }
	}
