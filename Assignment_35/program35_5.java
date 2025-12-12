import java.util.*;

class StringX
{
    public void DisplayReverse(String str)
    {
        int iCnt = 0;
        
        char[] Arr = str.toCharArray();
        
        for(iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }
    }
}

public class program35_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.DisplayReverse(sobj);
    }
}
