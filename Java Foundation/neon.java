class neon
{
    static void number(int n)
    {
        int sq = n*n;
        int res=0;
        while(sq!=0)
        {
            int d = sq%10;
            res += d;
            sq= sq/10;
        }
        if(n==res)
        System.out.println(n+" is a neon number");
        else
         System.out.println(n+" is not a neon number");
    }
    
    public static void main(String args[])
    {
        number(9);
    }
}