
public class PowerOfANumber {
    PowerOfANumber p1 = new PowerOfANumber();
    var results = p1.power(2,2);
    System.out.println(results);

    public int power(int base, int exp){
        if (exp<0){
            return -1;
        }
        if (exp ==0){
            return 1;
        }
        return base * power(base, exp-1);
    }
}
