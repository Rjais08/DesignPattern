import java.math.BigInteger;

public class DifferentAlgoInJava {

    public static void main(String[] args) {

        calculateFactOfBigInteger(5);
    }

    //
    public static BigInteger calculateFactOfBigInteger(int input){
        BigInteger fact = new BigInteger("1");
        BigInteger inc  = new BigInteger("1");
        for(int c = 1; c <= input; c++){
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        return fact;
    }

    public static int returnReverse(){
        return 0;
    }
}
