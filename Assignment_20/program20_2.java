////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : printReverse
//  Function Name : printReverse
//  Description :   Used to print numbers in reverse order from the given number to 1.
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class printReverse
{
    void printReverse(int iNo)
    {
        int iCnt = 0;

        System.out.println("Numbers in reverse order from " + iNo + " to 1 are:");

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program20_2
{
    public static void main(String args[])
    {
        printReverse obj = new printReverse();
        obj.printReverse(10);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 10 9 8 7 6 5 4 3 2 1
//
////////////////////////////////////////////////////////////////////////////////