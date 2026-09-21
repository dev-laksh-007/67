import java.util.*;
class N_G_G
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int rn_no = (int)(Math.random()*100)+1;
        int guess_no = 0;
        
        int score=0;
        String s = "No";
        System.out.println("**Number Guessing Game**");
        System.out.println("Guess Number from 1 to 100.");
        System.out.println("Total 5 attempts.");
        System.out.println("Hints will be provided in each round..");
        
        do
        {
            int attempts = 1;
        while(attempts<=5)
        {
            do
            {
                System.out.println("Enter your guess");
                guess_no = in.nextInt();
                
                if(guess_no >0 && guess_no <101)break;
                System.out.println("Please enter number from 1 to 100");
            }while(true);
            
            if(guess_no==rn_no)
            {
                System.out.println("**********You Win************");
                System.out.println("Total attempts:    "+ score);
                s = "No";
                break;
            }
            else if(guess_no>=rn_no)
            {
                System.out.println("HINT: The number is less than the "+ guess_no);
                
            }
            else
            {
                System.out.println("HINT: The number is greater than the "+ guess_no);
                
            }
            
            
            attempts++;
         
        }
        if(attempts>5)
        {
            System.out.println("You have used all your attempts.");
            System.out.println("Do you want to continue Yes/No? ");
            in.nextLine();
            s = in.nextLine();
        }
        score += attempts;
    }while(s.equals("Yes"));
    
    }
}