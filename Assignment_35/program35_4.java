import java.util.*;

class StringX
{
    public boolean CheckVowel(String str)
    {
        int iCnt = 0;
        char ch = '\0';
        
        for(iCnt = 0 ; iCnt < str.length() ; iCnt++)
        {
            ch = str.charAt(iCnt);
            
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}

public class program35_4
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        bRet = strobj.CheckVowel(sobj);

        if(bRet == true)
        {
            System.out.println("String contain vowel. ");
        }
        else
        {
            System.out.println("String does not contain vowels");
        }
    }
}