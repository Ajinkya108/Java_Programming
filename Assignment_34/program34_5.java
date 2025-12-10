import java.util.*;

class Pattern
{
    public void Display(char ch)
    {
        int cch= 0;
        cch = (int)ch;
        System.out.println("Deciaml value for "+ch+" is "+cch);

        cch = cch % 8;
    }
}

public class program34_5
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