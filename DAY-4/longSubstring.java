import java.util.*;
public class longSubstring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
		    int dup=0;
		    for(int k=0;k<i;k++)
		    {
		        if(str.charAt(i)==str.charAt(k))
		        {
		            dup=1;
		            break;
		        }
		    }
		    if(dup==1)
		    {
		        continue;
		    }
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j))
		        {
		            str1+=str.charAt(i);
		            break;
		        }
		    }
		}
		// System.out.print(str1);
		String count="";
		int max=0;
		for(int i=0;i<str1.length();i++)
		{
		    for(int j=i;j<str1.length();j++)
		    {
		        for(int k=i;k<=j;k++)
		        {
		            char ch=str1.charAt(k);
		            // System.out.print(ch);
		            count+=ch;
		            if(count.length()>max)
		            {
		                max=count.length();
		            }
		        }
		        count="";
		        System.out.println();
		    }
		}System.out.println(max);
	}
}