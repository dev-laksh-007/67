
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
   public static void main(String args[])
   {
    for(int i =1 ; i<=100;i++)
    {
        if(i%3==0 && i%5==0)
        System.out.println(i+" FizzBuzz");
        else if(i%5==0)
        System.out.println(i+" Buzz");
        else if(i%3==0)
        System.out.println(i+" Fizz");
    }
   }
}