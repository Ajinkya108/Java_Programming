import java.util.*;

class Pattern
{
    public void Display(char ch)
    {
        int iCnt = 0;
        char cha = 0;
        if(ch >= 'A' && ch <='Z')
        {
            for(iCnt = (int)ch; iCnt <= 'Z' ; iCnt++)
            {
                cha = (char)iCnt;
                System.out.print(cha+"\t");
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(iCnt = (int)ch ; iCnt >= 'a'; iCnt --)
            {
                cha = (char)iCnt;
                System.out.print(cha+"\t");
            }
        }
        else
        {
            System.out.println("Error : Please enter correct value ");
            System.out.println("You have not entered Alphabate");
        }
    }
}

public class program34_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue1 = '\0';
        boolean bRet = false;

        System.out.println("Enter the Charater:");
        cValue1 = sobj.next().charAt(0);

        Pattern pobj = new Pattern();
        pobj.Display(cValue1);

       
    }
}