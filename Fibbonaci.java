public class fibbonaciSeries
{
  public static int fibboRecc(int n)
  {
    if(n<2)
    {
      return n;
    }
    return fibbo(n-1)+fibbo(n-2);
  }

int a=0;
  System.out.print(a);
int b=1;
System.out.print(b);
public static void fibbo(int a,int b,int n)
{
  if(n==0)
  {
    return;
  }
  int c=a+b;
  System.out.print(c);
  fibbo(b,c,n-1);
}
}
  
  
