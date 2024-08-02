public static geekonaciSeries
  {
    public int geeko(int a,int b,int c,int n)
    {
      if(n==1)
      {
        return a;
      }
      else if(n==2)
      {
        return b;
      }
      else if(n==3)
      {
        return c;
      }
      return geeko(a,b,c,n-1)+geeko(a,b,c,n-2)+geeko(a,b,c,n-3);
    }

    public int geekoo(int a,int b,int c,int n)
    {
      int arr[]=new int[n];
      int arr[0]=a;
      int arr[1]=b;
      int arr[2]=c;
      for(int i=3;i<n;i++)
        {
          arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
      return arr[n-1];
    }
}
    
