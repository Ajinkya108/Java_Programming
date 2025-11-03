////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : countDigits
//  Function Name : countDigits
//  Description :   used to count the number of digits present in a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class countDigits
{
    void countDigits(int iNum)
    {
        int iCnt = 0;
        int temp = iNum;

        if(iNum == 0)
        {
            iCnt = 1;
        }
        else
        {
            while(iNum != 0)
            {
                iNum = iNum / 10;
                iCnt++;
            }
        }

        System.out.println("Number of digits in " + temp + " is : " + iCnt);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_5
{
    public static void main(String args[])
    {
        countDigits obj = new countDigits();
        obj.countDigits(7865);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 7865
//  Output : Number of digits in 7865 is : 4
//
////////////////////////////////////////////////////////////////////////////////