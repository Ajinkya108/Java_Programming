import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0, iCount = 0;
        char ch = '\0';

        for(iCnt = 0 ; iCnt < str.length() ; iCnt++)
        {
            ch = str.charAt(iCnt);
            
            if(ch >='a' && ch <='z')
            {
                iCount++;   
            }
        }
        return iCount;
    }
}

public class program35_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountSmall(sobj);

        System.out.println("Count of small character is : "+iRet);
    }
}