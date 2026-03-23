import java.util.*;
class moveZeros  
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            else
            {
                res[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
