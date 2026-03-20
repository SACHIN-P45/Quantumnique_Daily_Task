import java.util.*;
class Sqrt 
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=0, right=n;
        int res=0;
        while(left<=right) 
        {
            int mid=(left+right)/2;
            if (mid*mid==n) 
            {
                res=mid;
                break;
            } 
            else if (mid*mid<n) 
            {
                res=mid;
                left=mid+1;
            } 
            else
            {
                right=mid-1;
            }
        }
        System.out.println(res);
    }
}