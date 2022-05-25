package dynamicProgramming;
import java.util.*;
import java.util.Arrays;

public class ClimbingStairsWithVariableJumps {
	private static void helper(int []arr,int n)
	{
		int dp[]= new int[n+1];
		dp[n]=1;
		for(int i=n-1;i>=0;i--)
		{
			int steps=0;
			for(int j=arr[i];j>=1 && i+j<n+1;j--)
			{
				steps+=dp[i+j];
			}
			dp[i] = steps;
		}
		System.out.println(Arrays.toString(dp));
		System.out.println("Ans : "+dp[0]);
	}
	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		helper(arr,n);
	}

}
