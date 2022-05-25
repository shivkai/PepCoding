package dynamicProgramming;

public class ClimbStairsWithMinimumJumps {
	private static int minJumps(int arr[],int n) {
		Integer dp[] = new Integer[n+1];
		dp[n] = 0;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]>0)
			{
			int min=Integer.MAX_VALUE;
			for(int j=1;j<=arr[i] && i+j<n+1;j++)
			{
				if(dp[i+j]!=null) {
				min= Math.min(min, dp[i+j]);
				}
			}
			if(min!=Integer.MAX_VALUE)
			{
			dp[i]=1+min;
			}
			}
			
		}
		
		for(int i=0;i<n+1;i++)
		{
			System.out.print(dp[i]+" ");
		}System.out.println();
		return dp[0];

	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,4,9,8,1,1,10,1};
//		System.out.println(minJumps(arr,arr.length));
		System.out.println(Math.min(Integer.MIN_VALUE, 1));
	}

}
