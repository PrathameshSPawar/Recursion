public static CountString(
{
static int countstr(String str)
	{
		if(str=="")
		{
			return 0;
		}
		else{
			return 1+countstr(str.substring(1));
		}
	}
}
