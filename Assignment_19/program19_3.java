////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkDivisible
//  Function Name : checkDivisible
//  Description :   Used to check whether a given number is divisible by 5, 11, both, or neither.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkDivisible
{
    void checkDivisible(int iNo)
    {
        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            System.out.println(iNo + " is divisible by both 5 and 11.");
        }
        else if(iNo % 5 == 0)
        {
            System.out.println(iNo + " is divisible only by 5.");
        }
        else if(iNo % 11 == 0)
        {
            System.out.println(iNo + " is divisible only by 11.");
        }
        else
        {
            System.out.println(iNo + " is not divisible by 5 or 11.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program19_3
{
    public static void main(String args[])
    {
        checkDivisible obj = new checkDivisible();
        obj.checkDivisible(55);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 55    Output : 55 is divisible by both 5 and 11.
//
////////////////////////////////////////////////////////////////////////////////