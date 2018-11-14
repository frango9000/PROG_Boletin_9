package PROG_Boletin_9_2;

import java.math.BigInteger;

public class PROG_Boletin_9_2 {
    public static void main(String[] args) {
        int suma=0;
        BigInteger producto=new BigInteger("1");

        for (long i = 10L;i<=90;i++){
            suma +=i;
            BigInteger bigI;
            bigI = BigInteger.valueOf(i);
            producto = producto.multiply(bigI);
            //System.out.println(producto);
        }
        System.out.println("suma: "+suma);
        System.out.println("producto: "+producto);
    }
}
