////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkPerfect
//  Function Name : checkPerfect
//  Description :   Used to check whether a given number is a Perfect Number or not.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkPerfect
{
    void checkPerfect(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.println(iNo + " is a Perfect Number.");
        }
        else
        {
            System.out.println(iNo + " is NOT a Perfect Number.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_3
{
    public static void main(String args[])
    {
        checkPerfect obj = new checkPerfect();
        obj.checkPerfect(6);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6       Output : 6 is a Perfect Number.
//
////////////////////////////////////////////////////////////////////////////////