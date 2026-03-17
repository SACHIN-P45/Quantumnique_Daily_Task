import java.util.*;
class secmax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=max)
            {
                System.out.print(arr[i]);
                return;
            }
        }
    }
}
