// Java program to check if an array is a subset of another array

import java.util.*;

public class prog6{
    public static boolean subsetArrays(int arr1[], int arr2[], int m, int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++){
                if(arr2[i] == arr1[j])
                break;
            }

            if (j == m)
            return false;
        }

    return true;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array 1 : ");
        int n = sc.nextInt();

        System.out.println("Enter the size of array 2 : ");
        int m = sc.nextInt();

        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Input the array 1 elements : ");
        for(int i = 0 ; i < n ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Input the array 2 elements : ");
        for(int i = 0 ; i < m ; i++){
            arr2[i] = sc.nextInt();
        }

        if(subsetArrays(arr1 , arr2 , n , m))
            System.out.println("Array 2 is a subset of array 1");
        else
            System.out.println("Array 2 is not a subset of array 1");
    }
}
