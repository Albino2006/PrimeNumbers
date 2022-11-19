import java.io.FileReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.ToLongFunction;

public class Main {
/* 
    public static BigInteger fibonacci(BigInteger n) {
        if (n.longValue() <= 2) {
            return BigInteger.valueOf(1).longValue();
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        for (long i = 0; i < 92; i++) {
            String fibString = String.valueOf(fibonacci(i));
            if (fibString.substring(fibString.length() - 2).equals("00")) {
                System.out.println(fibonacci(i));
            }
        }
    }
*/

    static ArrayList<Integer> list = new ArrayList<>();
    

    public static Integer getPrimeNums() {
        for(int i = 2; i <= 50000; i++) {
            for(int j = 2; j <= i; j++) {
                if(i%j == 0) {
                
                } else {
                    list.add(j);
                } 
                if(i == 50000) {
                    break;
                }
                
            }
        }

        for(int i = 0; i <= list.size(); i++) {
            return list.get(i).intValue();
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getPrimeNums());
    }
}
