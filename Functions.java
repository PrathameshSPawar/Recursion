static void triangle1(int arr[])
	{
		if(arr.length<1)
		{
			return;
		}

		int newArr[]=new int[arr.length-1];
		for(int i=0;i<newArr.length;i++)
		{
			newArr[i]=arr[i]+arr[i+1];
		}
		triangle1(newArr);
		System.out.println(Arrays.toString(arr));
	}
