// Time Complexity : O(n)
// Space Complexity : O(1)

package Searching;

public class linearSearch {
    public static void main(String[] args){
        int key = 13;
        int a[] = {34,15,36,67,33,13};
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println(i);
            }
        }

    }
}
