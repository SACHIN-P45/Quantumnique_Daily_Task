// import java.util.*;
// class subarray
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int max=Integer.MIN_VALUE;;
//         int sum=0;
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for (int i=0;i<n;i++)  
//         {
//             for(int j=i;j<n;j++)
//             {
//                 sum+=arr[j];
//                 if(sum>max)
//                 {
//                     max=sum;
//                 }
//             }
//             sum=0;
//         }
//         System.out.print(max);
//     }
// }

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int sum=arr[0];
        for (int i=1;i<n;i++) {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        System.out.print(max);
    }
}