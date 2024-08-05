public hanoiPlacement{
public static void hanoi(int n,String src,String help,String desti)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" form "+src+"to"+desti);
            return;
        }
        hanoi(n-1,src,desti,help);
        System.out.println("transfer disk "+n+" form "+src+"to"+desti);
        hanoi(n-1,help,src,desti);
    }
}
