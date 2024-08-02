public class Minimum{
public static int minNum(int arr[],int n)
	{
		if(n==0)
		{
			return arr[0];
		}

		return Math.min(arr[n-1],minNum(arr, n-1));
	}

	public static int maxNum(int arr[],int n)
	{
		if(n==0)
		{
			return arr[0];
		}

		return Math.max(arr[n-1],maxNum(arr, n-1));
	}
}
