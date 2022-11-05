// WAP to sort an array using Quick Sort Algorithm.


import java.util.*;

public class prog2{

  static int partition(int arr[], int low , int high){
    int pivot = arr[low]  ;
    int i = low ;
    int j = high ;

    while (i < j) {

      while (arr[i] <= pivot && i <= high - 1) {
        i++  ;
      }

      while (arr[j] > pivot && j >= low) {
        j-- ;
      }

      if (i < j){
        int t = arr[i]  ; 
        arr[i] = arr[j]  ; 
        arr[j] = t ; 
      }
    }

    int t = arr[j]  ; 
    arr[j] = arr[low]  ; 
    arr[low] = t ; 

    return j ;
  }

  static void quicksort(int arr[] , int low, int high){
    
    if (low < high) {

      int pivot = partition(arr, low, high) ;
      quicksort(arr, low, pivot - 1)  ;
      quicksort(arr, pivot + 1, high)  ;
    
    }

  }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Quick Sort: ");

        for(int i=0; i < n ;i++){
            System.out.print(arr[i]+" ")  ; 
        }

        System.out.println();

        quicksort(arr,0,n-1); 

        System.out.println("After Quick Sort: ");

        for(int i=0; i < n ;i++){
            System.out.print(arr[i]+" ")  ; 
        }
    }
}