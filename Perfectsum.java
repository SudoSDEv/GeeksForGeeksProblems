import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    
    public static final int mod=1000000007; 
     
	public static void main (String[] args)throws IOException
	 {
	 //code
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        
	        int n=Integer.parseInt(br.readLine());
	        String[] s=br.readLine().split(" ");
	        int sum=Integer.parseInt(br.readLine());

	        int[] a=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=Integer.parseInt(s[i]);
            
            int[][] dp=new int[n][sum+1];
            for(int[] x:dp)
                Arrays.fill(x, -1);
	        
	        System.out.println(findOut(a, n-1, sum, dp));     
	        
	    }
	 
	 }
	 
	 public static int findOut(int[] a, int n, int sum, int[][] dp){
	     
	     if(sum==0) return 1;
	     if(n<0 || sum<0) return 0;
	     if(dp[n][sum]!=-1) return dp[n][sum];
	     
	     return dp[n][sum]=(findOut(a,n-1,sum-a[n],dp)+findOut(a,n-1,sum,dp))%mod;
	     
	 }
	 
}
