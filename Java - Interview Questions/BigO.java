
//Create a function which calculates the sum and product of elements of array

public class BigO {
    public static void main (String[] args){

    }

    void spofArray (int [] array){
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for ( int i=0; i<array.length; i++ ){
            product *= array[i];
        }

        System.out.println(sum + " "+product);
    }

}