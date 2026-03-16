import java.util.*;
class missing_value
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,11,9,8};
        Arrays.sort(arr);
        int n=arr[arr.length-1];
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++)
        {   
            arrsum+=arr[i];
        }
        int res=sum-arrsum;
        System.err.println(res);
    }
}