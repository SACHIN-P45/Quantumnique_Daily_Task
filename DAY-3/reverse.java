// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str=sc.nextLine();
//         String rev="";
//         for(int i=str.length()-1;i>=0;i--)
//         {
//             char ch=str.charAt(i);
//             rev+=ch;
//         }
//         System.out.println(rev);
//     }
// }

import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        System.out.println(rev);
    }
}