# Recursion


import java.util.*;
public class Recursion{
//Basically this function create a arrays triangle
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
 /*   [48]
   [20, 28]
  [8, 12, 16]
 [3, 5, 7, 9]
[1, 2, 3, 4, 5]*/

//Printing Minimun and Maximum number
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

 

 
