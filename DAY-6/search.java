import java.util.*;
class nonRepeat 
{
    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int target=9;
        int left=0;
        int right=arr.length-1;
        while(left < right) 
        {
            int sum=nums[left]+nums[right];
            if(sum==target) 
            {
                System.out.println((left+1)+" "+(right+1));
                return;
            }
            else if(sum<target) 
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
    }
}