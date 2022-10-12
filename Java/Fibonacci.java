//Fibannoci Sequence

class Fibannoci{
     public static void main(String[] args){
        Fibannoci f1 = new Fibannoci();
        var results = f1.fibannoci(4);
        System.out.println(results);
     }




    public int fibannoci(int n){
        //Constraint ~ if an input is entered that you is not valid for

        if (n<0){
            return -1;
        }
        //Base Case - When should it exit the loop of calling itself
        if (n==0 || n==1){
            return n;
        }

        //recurisive flow
        return fibannoci(n-1) + fibannoci(n-2);
    }
}