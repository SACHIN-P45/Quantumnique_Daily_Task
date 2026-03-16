// class max
// {
//     public static void main(String[] args) {
//         int arr[]={3,8,1,100,4};
//         int max=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//             {
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }
import java.util.*;
class max
{
    public static void main(String[] args) {
        int arr[]={3,8,1,100,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}