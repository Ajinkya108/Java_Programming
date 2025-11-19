import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize = 0;

    public ArrayX(int iNo)
    {
        System.out.println("Inside");

        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the element of Array :");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); 
        }
    }

    public void DisplayRange(int iStart, int iEnd)
    {
        int iCnt = 0, iTemp = 0;

        if(iStart > iEnd)
        {
            iTemp = iStart;
            iStart = iEnd;
            iEnd = iTemp; 
        }

        System.out.println("Elements of ranged array is :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iStart <= Arr[iCnt])
            {
                if(Arr[iCnt] <= iEnd)
                {
                    System.out.println(Arr[iCnt]);
                }
            }
        }
    }

}
class program23_4
{
    public static void main(String A[])
    {
        int iValue = 0, iStart = 0, iEnd = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        System.out.println("Enter the Strating number : ");
        iStart = sobj.nextInt();
        System.out.println("Enter the Ending number : ");
        iEnd = sobj.nextInt();

        aobj1.DisplayRange(iStart, iEnd);

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}