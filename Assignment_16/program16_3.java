////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : findFactorial
//  Function Name : findFactorial
//  Description :   It is used to calculate the factorial of a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class findFactorial
{
    void findFactorial(int iNum)
    {
        int iFact = 1;

        for(int i = 1; i <= iNum; i++)
        {
            iFact = iFact * i;
        }

        System.out.println("Factorial of " + iNum + " is : " + iFact);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_3
{
    public static void main(String args[])
    {
        findFactorial obj = new findFactorial();
        obj.findFactorial(5);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5
//  Output : Factorial of 5 is : 120
//
////////////////////////////////////////////////////////////////////////////////