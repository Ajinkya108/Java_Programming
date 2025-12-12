import java.util.*;

class StringX
{
    public int CountDiffrence(String str)
    {
        int iCnt = 0, iCountSmall = 0, iCountCapital = 0;
        char ch = '\0';

        for(iCnt = 0 ; iCnt < str.length() ; iCnt++)
        {
            ch = str.charAt(iCnt);
            
            if(ch >='a' && ch <='z')
            {
                iCountSmall++;   
            }
            else if(ch >= 'A' && ch <='z')
            {
                iCountCapital++;
            }
        }
        return (iCountSmall-iCountCapital);
    }
}

public class program35_3
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountDiffrence(sobj);

        if(iRet <= 0)
        {
            iRet = -iRet;
        }
        System.out.println("Diffrence between small character and capital character is : "+iRet);
    }
}