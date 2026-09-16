import java.util.*;
class grade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double marks, attendence=0.0;
        System.out.print("Enter the marks: ");
        marks = sc.nextDouble();
        if(marks>=40){
        System.out.print("Enter the attendence percentage: ");
        attendence = sc.nextDouble();
        }

        if(marks>=80 && attendence>=75)
        {
            System.out.println("Pass: Grade A and Eligible for Scholarship.");
        }
        else if(marks>=80 && attendence <=75)
        {
           System.out.println("Pass: Grade A and Not Eligible for Scholarship.");
        }
        else if(marks>=60 && attendence>=75)
        {
            System.out.println("Pass: Grade B and Eligible for Scholarship.");
        }
        else if(marks>=60 && attendence<=75)
        {
            System.out.println("Pass: Grade B and Not Eligible for Scholarship.");
        }
        else if(marks>=40)
        {
            System.out.println("Pass: Grade C and Not Eligible for Scholarship.");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}


