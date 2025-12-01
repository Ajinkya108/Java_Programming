import java.util.*;

class Pattern
{
    public void Display(char cCh)
    {
        if(cCh == 'A')
        {
            System.out.println("Exam time is 7 AM");
        }
        else if(cCh == 'B')
        {
            System.out.println("Exam time is 8.30 AM");
        }
        else if(cCh == 'C')
        {
            System.out.println("Exam time is 9.30 AM");
        }
        else if(cCh == 'D')
        {
            System.out.println("Exam time is 10.30 AM");
        }
        else
        {
            System.out.println("Please enter correct Division");
        }
    }
}

public class program33_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue1 = 0;
        boolean bRet = false;

        System.out.println("Enter the Charater:");
        cValue1 = sobj.next().charAt(0);

        Pattern pobj = new Pattern();
        pobj.Display(cValue1);

    }
}