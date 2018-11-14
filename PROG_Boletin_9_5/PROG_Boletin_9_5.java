package PROG_Boletin_9_5;

public class PROG_Boletin_9_5 {
    public static void main(String[] args) {
        add2(10, 0);
        altAbs(10,0);
        fibonacci(10, 0);
    }

    private static void add2(int ciclos, int num){
        int contador=0;
        System.out.println(++contador+": "+num);
        while (ciclos-1>0){
            num+=2;
            System.out.println(++contador+": "+num);
            ciclos--;
        }
    }
    private static void altAbs(int ciclos, int num){
        int contador=0;

        System.out.println(++contador+": "+num);
        while (ciclos-1>0){
            if (num >0) {
                num += 1;
                num *= -1;
            }else{
                num *= -1;
                num += 1;
            }
            System.out.println(++contador+": "+num);
            ciclos--;
        }
    }
    private static void fibonacci(int ciclos, int num){
        int contador=0;
        int num1=0, num2=0;
        System.out.println(++contador+": "+num);
        while (ciclos-1>0){
            if (num==0)num1=1;
            num=num1+num2;
            num1=num2;
            num2=num;

            System.out.println(++contador+": "+num);
            ciclos--;
        }
    }
}
