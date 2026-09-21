
class complex_number
{
    int real;
    int imag;
    
    public complex_number( int real, int imag)
    {
        this.real = real;
        this.imag = imag;
    }
    
    public void show()
    {
        System.out.println(this.real + " " + "+" + " " + this.imag+"i");
    }
    
    public void addCN(complex_number c1, complex_number c2)
    {
        complex_number res = new complex_number(0,0);
        res.real = c1.real + c2.real;
        res.imag = c1.imag + c2.imag;
        
        System.out.println(res.real + " " + "+" + " " + res.imag+"i");
    }
    
    public static void main(String args[])
    {
        complex_number c1 = new complex_number(3,5);
        c1.show();
        complex_number c2 = new complex_number(5,3);
        c2.show();
        complex_number res = new complex_number(0,0);
        res.addCN(c1, c2);
        
        
    }
}