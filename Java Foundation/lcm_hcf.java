class lcm_hcf
{
    public static int hcf(int a, int b)
    {
        int s = 2;
        while(true)
        {
            if(a%s==0 && b%s==0)
            break;
            s++;
        }
        return s;
    }
    public static int lcm(int a, int b)
    {
        int g = Math.max(a,b);
        while(true)
        {
            if(g%a==0 && g%b== 0)
            break;
            g++;
        }
        return g;
    }
    public static void main(String args[])
    {
        System.out.println(hcf(45,33));
        System.out.println(lcm(23,69));
    }
}