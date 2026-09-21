
/**
 * Write a description of class star_pyramid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class star_pyramid
{
    public static void main(String args[])
    {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 5 ; j > i ; j--)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= (2*i) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}