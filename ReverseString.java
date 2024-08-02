public class ReverseString{
        public static void reverseStr(char[] s)
        {
                revStr2(s, 0, s.length - 1);
        }
        
        public static void revStr2(char[] s, int left, int right) 
        {
                if (left >= right) 
                {
                        return;
                }
                
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                revStr2(s,left+1,right-1); // Correctly increment left and decrement right
        }
        
        public static void revStr1(char[] s)
	{
		int left=0;
		int right=s.length-1;
		while(left<=right)
		{
			int temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			left++;
			right--;
		}
	}
}
