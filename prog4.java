// WAP to sort an array using Merge Sort Algorithm.

import java.util.*;

class MergeSortClass {
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, mid + 1, r); // right half
            mergeSort(arr, l, mid); // left half
            merge(arr, l, mid, r); // merging sorted halves
        }
    }

    void merge(int arr[], int l, int mid, int r) {
        int i = l; // starting index of left half of arr
        int j = mid + 1; // starting index of right half of arr
        int f = l; // index used to transfer elements in temporary array
        int temp[] = new int[100000]; // temporary array

        // storing elements in the temporary array in a sorted manner//
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[f] = arr[i];
                i++;
            } 
            else {
                temp[f] = arr[j];
                j++;
            }
            f++;
        }

        // if elements on the left half are still left //

        if (i > mid) {
            while (j <= r) {
                temp[f] = arr[j];
                f++;
                j++;
            }
        } 
        else {
        // if elements on the right half are still left //
            while (i <= mid) {
                temp[f] = arr[i];
                f++;
                i++;
            }
        }

        // transfering all elements from temporary to arr //
        for (f = l; f <= r; f++) {
            arr[f] = temp[f];
        }
    }
}

public class prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Merge sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSortClass obj = new MergeSortClass();
        obj.mergeSort(arr, 0, n - 1);
        System.out.println("After Merge sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}