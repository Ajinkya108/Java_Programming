import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCnt = 0, iCount = 0;
        char ch = '\0';

        for(iCnt = 0 ; iCnt < str.length() ; iCnt++)
        {
            ch = str.charAt(iCnt);
            
            if(ch >='A' && ch <='Z')
            {
                iCount++;   
            }
        }
        return iCount;
    }
}

public class program35_1
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountCapital(sobj);

        System.out.println("Count of capital character is : "+iRet);
    }
}