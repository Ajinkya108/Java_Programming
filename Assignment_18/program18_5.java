////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : checkSign
//  Function Name : checkSign
//  Description :   It is used to check whether the given number is positive, negative, or zero
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class checkSign
{
    void checkSign(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println(iNo + " is a Positive number.");
        }
        else if(iNo < 0)
        {
            System.out.println(iNo + " is a Negative number.");
        }
        else
        {
            System.out.println("Number is Zero.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program18_5
{
    public static void main(String args[])
    {
        checkSign obj = new checkSign();
        obj.checkSign(-8);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : -8       Output : -8 is a Negative number.
//
////////////////////////////////////////////////////////////////////////////////