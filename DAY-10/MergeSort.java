import java.util.*;
public class MergeSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] temp=new int[n];
        for(int size=1;size<n;size*=2)
        {
            for(int left=0;left<n;left+=2*size)
            {
                int mid=Math.min(left+size-1,n-1);
                int right=Math.min(left+2*size-1,n-1);
                int i=left,j=mid+1,k=left;
                while(i<=mid&&j<=right)
                {
                    if(arr[i]<arr[j])
                    {
                        temp[k++]=arr[i++];
                    }
                    else
                    {
                        temp[k++]=arr[j++];
                    }
                }
                while(i<=mid)
                {
                    temp[k++]=arr[i++];
                }
                while(j<=right)
                {
                    temp[k++]=arr[j++];
                }
                for(i=left;i<=right;i++)
                {
                    arr[i]=temp[i];
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}