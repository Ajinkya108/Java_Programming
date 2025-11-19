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

    public int Maximum()
    {
        int iCnt = 0, iMax = 0;

        iMax = Arr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iMax < Arr[iCnt])
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }

}
class program24_1
{
    public static void main(String A[])
    {
        int iValue = 0, iCal = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        iCal = aobj1.Maximum();

        System.out.println("Maximum of numbers is "+iCal);

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}