import java.util.*;
public class firstNonRepeat
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
		    int dup=0;
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j))
		        {
		            dup++;
		        }
		        
		    }
		    if(dup==0)
		        {
		            str1+=str.charAt(i);
		            break;
		        }
		}
		System.out.println(str1);
	}
}