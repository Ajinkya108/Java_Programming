import java.util.*;

class Pattern
{
    public void Display(char ch)
    {
        if(ch  >= 'A' && ch <= 'Z' )
        {
            ch = (char)(ch + 32);
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32);
        }
        System.out.println(ch);
    }
}

public class program34_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue1 = '\0';

        System.out.println("Enter the Charater:");
        cValue1 = sobj.next().charAt(0);

        Pattern pobj = new Pattern();
        pobj.Display(cValue1);

    }
}