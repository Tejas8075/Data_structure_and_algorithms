// Time Complexity = O(log n) If the array is sorted. 
// else : Time Complexity = O(Time Complexity of Sorting Algorithm + log n)
// Space Complexity = O(1)

// Performed only on Sorted Arrays

// Logic : Consider you are Searching a word in Dictionary (we choose a dictionary because it is sorted) which is success. To search it we first randomly open at any word assuming 'P' now see if P is before 'S' or after. If before consider searching in first to 'P-1' letters else search in 'P+1' letters. Repeat it for considering the last element as well.



package Searching;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = { 4, 6, 6, 60, 35, 45, 22, 96 };
        // To Sort
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
        int key = 60;
        int low = 0;
        int high = a.length;
        int mid = 0;
        int c = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (key == a[mid]) {
                // System.out.print(mid);
                c++;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;

            } else if (key > a[mid]) {
                low = mid + 1;

            }
        }
        if(c>0){
            System.out.print(mid);
        }
        else {

            System.out.println(-1);
        }
    }
}
