// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    static boolean isPossible(int a[], int n, int m, int currmin)
    {
        int stud = 1;
        int currsum = 0;
        
        for(int i = 0; i < n; i++) {
            currsum += a[i];
            if(currsum > currmin)
            {
                stud++;
                currsum = a[i];
        
            }
        }
        return stud <= m;
    }
    public static int findPages(int[]a,int n,int m)
    {
        //Your code here
        int sum = 0;
        
        if( n < m ) return -1;
        
        for( int i: a) sum += i;
        
        int s = a[n-1], e = sum;
        int res = Integer.MAX_VALUE;
        
        while(s <= e) {
            int mid = s + (e - s) / 2;
            
            if(isPossible(a, n, m, mid))
            {
                res = mid;
                e = mid - 1;
            }
            else
                s = mid + 1;
        }
        return res;
        
    }
}