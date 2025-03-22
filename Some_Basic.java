import java.util.*;
public class Main
{
	/*Tiling Problem
Given a 4 X N board and tiles of size 4 X 1 , count the number of ways to tile the given board using 4 X 1 tiles.
A tile can be placed horizontally i.e as 1 X 4 tile or vertically i.e as 4 X 1 tile.
sample input: N = 4
sample intput: 2*/
    public static int ways(int n)
    {
        if(n==0 || n==1 || n==2 || n==3) return 1;
        return ways(n-1)+ways(n-4);
    }

	/*Count Binary Strings
Count the number of binary strings with no consecutive ones that can be formed using binary string of length N.
sample input: N = 2
sample output: 3
*/	public static int binary(int n)
	{
		if(n=0) return 1;
		if(n=1) return 2;
		return binary(n-1)+binary(n-2);
	}

	/*Staircase Problem (Ways to Climb Stairs)
A person is standing at the bottom of a staircase with N steps. They can take either 1 step or 2 steps at a time. 
Find the total number of ways they can reach the top.
🔹 Recurrence Relation:𝐹(𝑁)=𝐹(𝑁−1)+𝐹(𝑁−2)
F(N)=F(N−1)+F(N−2)
🔹 Explanation:

If they take 1 step, then they need to solve for F(N-1).
If they take 2 steps, then they need to solve for F(N-2).*/
	public static int stairs(int n)
    	{
        	if(n==1) return 1;
        	if(n==2) return 2;
        	return stairs(n-1)+stairs(n-2);
    	}

	/*Subset Sum Problem
Given an array of integers and a target sum S, determine the number of ways to choose elements from the array such that their sum equals S.

🔹 Recurrence Relation: F(N,S)=F(N−1,S)+F(N−1,S−arr[N])
🔹 Explanation:
Either exclude the current element → Solve F(N-1, S).
Or include the current element → Solve F(N-1, S - arr[N]).*/
    	public static int subsetSum(int n,int arr[],int sum)
    	{
        //n++;
        	if(sum==0) return 1;
        	if(n==arr.length) return 0;
        	return subsetSum(n+1,arr,sum)+subsetSum(n+1,arr,sum-arr[n]);
    	}

	/*Coin Change Problem
Given a set of coins {C1, C2, ..., Cm} and an amount N, find the number of ways to make N using these coins. You can use unlimited copies of each coin.
🔹 Recurrence Relation: F(N)=F(N−C1)+F(N−C2)+...+F(N−Cm)
🔹 Explanation:
We can include a coin and solve for F(N - coin).
Or exclude a coin and solve for F(N-1)*/
    	public static int coinChange(int n,int coin[],int sum)
    	{
        	if(sum==0) return 1;
        	if(n==coin.length || sum <0) return 0;
        	return coinChange(n,coin,sum-coin[n])+coinChange(n+1,coin,sum);
    	}

	
	public static void main(String[] args) {
		System.out.println("\nEnter the value of 4*N:");
		Scanner pp=new Scanner(System.in);
		int n=pp.nextInt();
		int ans=ways(n);
		System.out.println(ans);
	}
}
