public class Occurence{
    public static int first=-1;
    public static int last=-1;

    public static void occurance(String str,int indx,char element)
    {
        if(indx==str.length())
        {
            System.out.println(first+1);
            System.out.println(last+1);
            return;
        }
        char curr=str.charAt(indx);
        if(curr==element)
        {
            if(first==-1)
            {
                first=indx;
            }
            else
            {
                last=indx;
            }
            //occurance(str, indx+1, element);
        }
        occurance(str, indx+1, element);
    }
}
