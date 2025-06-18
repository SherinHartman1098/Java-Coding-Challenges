/*Objective
Today we will learn about running time, also known as time complexity. Check out the Tutorial tab for learning materials and an instructional video.
Task
A prime is a natural number greater than  that has no positive divisors other than and itself. Given a number, , determine and print whether it is  or .
Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code.
Input Format
The first line contains an integer, , the number of test cases.
Each of the  subsequent lines contains an integer, , to be tested for primality.
Constraints


Output Format
For each test case, print whether  is  or  on a new line.
Sample Input
3
12
5
7
Sample Output
Not prime
Prime
Prime
Explanation
Test Case 0: .
 is divisible by numbers other than  and itself (i.e.: , , , ), so we print  on a new line.
Test Case 1: .
 is only divisible  and itself, so we print  on a new line.
Test Case 2: .
 is only divisible  and itself, so we print  on a new line. */

package HackerRank;


import java.io.*;
import java.util.*;

public class TimeandComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      
      for(int i=0;i<arr.length;i++){
    if(arr[i] <= 1) {
        System.out.println("Not prime");
        continue;
    }

    if(isPrime(arr[i])){
        System.out.println("Prime");
    } else {
        System.out.println("Not prime");
    }
}
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
