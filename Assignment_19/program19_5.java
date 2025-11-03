////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : calculatePower
//  Function Name : calculatePower
//  Description :   Used to calculate the power of a given base raised to an exponent.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class calculatePower
{
    void calculatePower(int iBase, int iExp)
    {
        int iCnt = 0;
        int iResult = 1;

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iResult = iResult * iBase;
        }

        System.out.println(iBase + " raised to " + iExp + " is: " + iResult);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program19_5
{
    public static void main(String args[])
    {
        calculatePower obj = new calculatePower();
        obj.calculatePower(2, 5);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2, 5     Output : 2 raised to 5 is: 32
//
////////////////////////////////////////////////////////////////////////////////