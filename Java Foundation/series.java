
/**
 * Write a description of class series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class series
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        double sum = 0.0;

for (int i = 1; i <= n; i++) {
    sum += 1.0 / i;
}

System.out.println("Sum: " + sum);
    }
}