import java.util.*;

class Pattern
{
    public boolean CheckChar(char ch)
    {
        if(ch == '!'||ch == '@'||ch == '#'||ch == '$'||ch == '%'||ch == '^'||ch == '&'||ch == '*' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program34_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue1 = '\0';
        boolean bRet = false;

        System.out.println("Enter the Charater:");
        cValue1 = sobj.next().charAt(0);

        Pattern pobj = new Pattern();
        bRet = pobj.CheckChar(cValue1);

        if(bRet == true)
        {
            System.out.println(cValue1+" is a character");
        }
        else
        {
            System.out.println(cValue1+" is a not character");
        }
    }
}