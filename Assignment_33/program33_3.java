import java.util.*;

class Pattern
{
    public boolean Display(char cCh)
    {
        if(cCh < '9' && cCh > '0')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program33_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue1 = 0;
        boolean bRet = false;

        System.out.println("Enter the Charater:");
        cValue1 = sobj.next().charAt(0);

        Pattern pobj = new Pattern();
        bRet = pobj.Display(cValue1);

        if(bRet == true)
        {
            System.out.println(cValue1+" is a Digit");
        }
        else
        {
            System.out.println(cValue1+" is not a Digit");
        }
    }
}