//Recursion Syntax 

/*
 MUST HAVES
----------------------------------
1. It needs to have it call itself

2. Has a Base condition that allows it to exit from an infinite loop
*/

//Writing a Recursion method using Factorial
class Recursion {
    public static void main(String[] args){
        Recursion r1 = new Recursion();
        var results  = r1.factorial(4);
        System.out.println(results);
    }


    public int factorial(int n){
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}


