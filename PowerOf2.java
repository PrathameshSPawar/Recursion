public static PowerOfN
{
  public static boolean twoPow(int n){
		for(int i=0;i<31;i++)
		{
			int num=(int)Math.pow(2, i);
			if(n==num)
			{
				return true;
			}
		}
		return false;
	}
}
    
