class amstrg

{
    public void no(int a, int b)
    {
         for(int i = a ; i < b ; i++)
         {
             int c =0;
             int ast=0;
            int n = i;
             //
             while(n!=0)
             {
                 c++;
                 n=n/10;
                 
             }
              n = i;
             while(n!=0)
             {
                 int d = n%10;
                 ast = ast+ (int)Math.pow(d,c);
                 n=n/10;
             }
             
             if(i == ast)
             {
                 System.out.println(i +" ");
             }
         }
    }
    
    public static void main(String args[])
    {
        amstrg ob = new amstrg();
        ob.no(50, 500);
        System.out.println("Program ends ");
    }
}