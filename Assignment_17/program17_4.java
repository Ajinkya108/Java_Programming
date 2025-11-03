////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : findMin
//  Function Name : findMin
//  Description :   It is used to find the smallest number among three given numbers
//  Input :         Integer
//  Author :        Ajinkya Rajendra Ghag
//  Date :          03-11-2025
//
////////////////////////////////////////////////////////////////////////////////

class findMin
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        int iMin = iNo1;

        if(iNo2 < iMin)
        {
            iMin = iNo2;
        }

        if(iNo3 < iMin)
        {
            iMin = iNo3;
        }

        System.out.println("Smallest number among " + iNo1 + ", " + iNo2 + ", and " + iNo3 + " is : " + iMin);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
////////////////////////////////////////////////////////////////////////////////

class program17_4
{
    public static void main(String args[])
    {
        findMin obj = new findMin();
        obj.findMin(3, 7, 2);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 3   7   2      Output : Smallest number among 3, 7, and 2 is : 2
//
////////////////////////////////////////////////////////////////////////////////