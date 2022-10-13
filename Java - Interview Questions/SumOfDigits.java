/*Question number 1
Find the sum of digits of a positive integer number using Recursion?
*/

class SumOfDigits {
    SumOfDigits n1= new SumOfDigits();
    var results = n1.recursion_sumOfDigits(4);
    System.out.println(results);

    public int recursion_sumOfDigits(int n){

        //Constraints - What input will not work for our functionality
        if (n<0){
            return 0;
        }

        //Base Case - When does it exit the  recursive loop
        if (n == 0 || n<0){
            return 0;
        }

        //Recursive Case ~ The Flow
        return n%10 + recursion_sumOfDigits(n/10);
    }
}
