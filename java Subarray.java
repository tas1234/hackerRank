import java.io.*;
import java.util.*;
/* Print the number of subarrays A of  having negative sums */

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size = scanner.nextInt();
        int[] array= new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    
        int count =0;
        
        for (int i=0; i<size; i++){
            int sum =array[i];
            if (sum < 0){
                count++;
            }

            for (int j=i+1; j<size; j++){
                sum+= array[j];
                if (sum<0) {
                    count++;
                }
            
            }
        }
        scanner.close();
        System.out.println(count); 
        

    }
}
