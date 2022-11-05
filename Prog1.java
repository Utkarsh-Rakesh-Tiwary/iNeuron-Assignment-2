// Problem Statement :: Given an array of n integers. The task is to print the duplicate      in the given array. If there are no duplicates then print "No Duplicates Found". 


// This problem can be solved using two approach ::
//      1. Using Nested Loop            &
//      2. using HashMap 

// HashMap has not been discussed yet , hence solving this using nested loop method.


// Time Complexity :- O(n^2)
// Space Complexity :- O(1)

import java.util.*;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements in array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean checkDuplicates = false;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n-1 ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                if(arr[i] == arr[j]) {
                    if(list.contains(arr[i])) {
                        break;
                    }
                    else {
                        list.add(arr[i]);
                        checkDuplicates = true;
                    }
                }
            }
        }
        if(checkDuplicates == true) {
            System.out.println(list);
        }
        else {
            System.out.println("No Duplicates Found");
        }
    }
}
