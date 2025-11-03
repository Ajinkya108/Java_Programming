////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : printDivisibleBy2and3
//  Function Name : printDivisibleBy2and3
//  Description :   Prints all numbers up to a given limit that are divisible by both 2 and 3.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class printDivisibleBy2and3
{
    void printDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        System.out.println("Numbers up to " + iNo + " divisible by both 2 and 3 are:");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////////////////////////

class program21_5
{
    public static void main(String args[])
    {
        printDivisibleBy2and3 obj = new printDivisibleBy2and3();
        obj.printDivisibleBy2and3(30);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 30  → Output : 6, 12, 18, 24, 30
//
////////////////////////////////////////////////////////////////////////////////