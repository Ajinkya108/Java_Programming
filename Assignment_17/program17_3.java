////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : findMax
//  Function Name : findMax
//  Description :   It is used to find the maximum of two given numbers
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class findMax
{
    void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is greater than " + iNo2);
        }
        else if(iNo2 > iNo1)
        {
            System.out.println(iNo2 + " is greater than " + iNo1);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program17_3
{
    public static void main(String args[])
    {
        findMax obj = new findMax();
        obj.findMax(20, 15);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 20   15     Output : 20 is greater than 15
//
////////////////////////////////////////////////////////////////////////////////