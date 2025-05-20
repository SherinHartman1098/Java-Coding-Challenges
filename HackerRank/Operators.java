/*
 * Problem statement:-
 * https://hackerrank-challenge-pdfs.s3.amazonaws.com/17155-30-operators-English?response-content-disposition=inline%3B%20filename%3D30-operators-English.pdf&response-content-type=application%2Fpdf&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAR6O7GJNX5DNFO3PV%2F20250520%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250520T200756Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Signature=26c431a0217693f2821cab520d265c49c40f697e8fdd4b275aa3ef6c027f3cec
 */

package HackerRank;


import java.io.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double tip= (meal_cost*tip_percent)/100;
    double tax=(tax_percent*meal_cost)/100;
    double total_cost=meal_cost+tip+tax;
    
    System.out.println(Math.round(total_cost));
    }

}
public class Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
