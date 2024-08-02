public class FirstUpperCase{
	public static char firstUP(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				return str.charAt(i);
			}
		}
		return 0;
	}
}
