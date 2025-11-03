////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : printEvenNumber
//  Function Name : printEvenNumber
//  Description :   It is used to print all even numbers up to a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class printEvenNumber
{
    void printEvenNumber(int iNo)
    {
        int iCnt = 0;

        System.out.println("Even numbers up to " + iNo + " are:");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
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

class program18_2
{
    public static void main(String args[])
    {
        printEvenNumber obj = new printEvenNumber();
        obj.printEvenNumber(10);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 2  4  6  8  10
//
////////////////////////////////////////////////////////////////////////////////
