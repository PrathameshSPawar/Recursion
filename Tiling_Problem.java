import java.util.*;
public class Main
{
    public static int ways(int n)
    {
        if(n==0 || n==1 || n==2 || n==3)
        {
            return 1;
        }
        
        return ways(n-1)+ways(n-4);
    }
	public static void main(String[] args) {
		System.out.println("\nEnter the value of 4*N:");
		Scanner pp=new Scanner(System.in);
		int n=pp.nextInt();
		int ans=ways(n);
		System.out.println(ans);
	}
}
