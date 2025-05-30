/*Objective
Today, we're discussing a simple sorting algorithm called Bubble Sort. Check out the Tutorial tab for learning materials and an instructional video!
Consider the following version of Bubble Sort:
for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}
Task
Given an array, , of size  distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following  lines:
Array is sorted in numSwaps swaps.
where  is the number of swaps that took place.
First Element: firstElement
where  is the first element in the sorted array.
Last Element: lastElement
where  is the last element in the sorted array.
Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.
Example

original a: 4 3 1 2
round 1  a: 3 1 2 4 swaps this round: 3
round 2  a: 1 2 3 4 swaps this round: 2
round 3  a: 1 2 3 4 swaps this round: 0
In the first round, the  is swapped at each of the  comparisons, ending in the last position. In the second round, the  is swapped at of the  comparisons. Finally, in the third round, no swaps are made so the iterations stop. The output is the following:
Array is sorted in 5 swaps.
First Element: 1
Last Element: 4
Input Format
The first line contains an integer, , the number of elements in array .
The second line contains  space-separated integers that describe .
Constraints

, where .
Output Format
Print the following three lines of output:
Array is sorted in numSwaps swaps.
where  is the number of swaps that took place.
First Element: firstElement
where  is the first element in the sorted array.
Last Element: lastElement
where  is the last element in the sorted array.
Sample Input 0
3
1 2 3
Sample Output 0
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
Explanation 0
The array is already sorted, so  swaps take place and we print the necessary  lines of output shown above.
Sample Input 1
3
3 2 1
Sample Output 1
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
Explanation 1
The array  is not sorted, so we perform the following swaps. Each line shows  after each single element is swapped.



After  swaps, the array is sorted. */

package HackerRank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class sortingProblem {
    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int numSwaps=0;
        int temp=0;
        boolean swapped=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a.get(j)>a.get(j+1)){
                    
                  
                    temp=a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numSwaps++;
                    swapped = true;
                }
            }
            if (!swapped) break; 
            
        } 
        
        System.out.println("Array is sorted in "+ numSwaps+" swaps.");
        System.out.println("First Element: "+ a.get(0));
        System.out.println("Last Element: "+ a.get(n-1));
        bufferedReader.close();
        
    }
}
