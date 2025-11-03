////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkEvenOdd
//  Function Name : checkEvenOdd
//  Description :   It is used to check whether the given number is even or odd
//  Input :         int
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkEvenOdd
{
    void checkEvenOdd(int iNum)
    {
        if(iNum % 2 == 0)
        {
            System.out.println(iNum + " is an Even number.");
        }
        else
        {
            System.out.println(iNum + " is an Odd number.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_2
{
    public static void main(String args[])
    {
        checkEvenOdd obj = new checkEvenOdd();
        obj.checkEvenOdd(7);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 7
//  Output : 7 is an Odd number.
//
//
////////////////////////////////////////////////////////////////////////////////