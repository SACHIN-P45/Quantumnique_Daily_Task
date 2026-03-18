import java.util.Scanner;
class stringPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.replaceAll(" ","").toLowerCase();
        String rev="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            char ch=str1.charAt(i);
            rev+=ch;
        }
        // System.out.println(rev);
        // System.out.println(str1);
        if(rev.equals(str1))
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}