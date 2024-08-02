public class Multiplication
{
//recursive multiplication
	public static int recMulti(int x,int y)
	{
		if(x<y){
			return recMulti(y, x);
		}
		else if(y!=0)
		{
			return x+recMulti(x, y-1);
		}
		else
		{
			return 0;
		}
	}
}
