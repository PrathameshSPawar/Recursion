public class SumOfDig
{
public static int sum=0;
	public static int sumdig(int n)
	{
		if(n==0)
		{
			return sum;
		}
		sum=sum+(n%10);
		return sumdig(n/10);
	}
}
