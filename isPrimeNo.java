public static isPrimeNo
{
public static boolean isPrime(int num,int n)
	{
		if(num<=2)
		{
			return (num==2)?true:false;
		}
		if(num%n==0)
		{
			return false;
		}
		return isPrime(num, n+1);
	}
}
