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

    public void DisplayThreeDigit()
    {
        for(int i = 0; i < iSize; i++)
        {
            if( (Arr[i] >= 100 && Arr[i] <= 999) || (Arr[i] <= -100 && Arr[i] >= -999) )
            {
                System.out.println(Arr[i]);
            }
        }
    }

}
class program24_4
{
    public static void main(String A[])
    {
        int iValue = 0, iCal = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        aobj1.DisplayThreeDigit();

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}