////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : printOddNumber
//  Function Name : printOddNumber
//  Description :   It is used to print all odd numbers up to a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class printOddNumber
{
    void printOddNumber(int iNo)
    {
        int iCnt = 0;

        System.out.println("Odd numbers up to " + iNo + " are:");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_3
{
    public static void main(String args[])
    {
        printOddNumber obj = new printOddNumber();
        obj.printOddNumber(20);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 20      Output : 1  3  5  7  9  11  13  15  17  19
//
////////////////////////////////////////////////////////////////////////////////