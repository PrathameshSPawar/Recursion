public class BinarySea{
  public static int binarySer(int arr[],int ele,int s,int e)
	{
		if(s>e)
		{
			return -1;
		}
		int mid=s+(e-s)/2;
		if(arr[mid]==ele)
		{
			return mid;
		}

		if(arr[mid]>ele)
		{
			return binarySer(arr, ele, s, mid-1);
		}
		else{
			return binarySer(arr, ele, mid+1, e);
		}
	}
}
