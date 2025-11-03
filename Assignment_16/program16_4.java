////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : reverseNumber
//  Function Name : reverseNumber
//  Description :   It is used to reverse the digits of a given number
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class reverseNumber
{
    void reverseNumber(int iNum)
    {
        int iRev = 0;
        int iDigit = 0;
        int temp = iNum;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iRev = (iRev * 10) + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Reverse of " + temp + " is : " + iRev);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program16_4
{
    public static void main(String args[])
    {
        reverseNumber obj = new reverseNumber();
        obj.reverseNumber(1234);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1234
//  Output : Reverse of 1234 is : 4321
//
////////////////////////////////////////////////////////////////////////////////