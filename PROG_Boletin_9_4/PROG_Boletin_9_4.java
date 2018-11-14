package PROG_Boletin_9_4;

import java.util.Scanner;

public class PROG_Boletin_9_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        System.out.println("Tabla de productos del numero : "+num);

        for (int i=1; i<11;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
