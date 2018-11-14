package PROG_Boletin_9_6;

import java.util.Scanner;

public class PROG_Boletin_9_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont=0, cont999=0, cont1750=0;
        float sueldo=1;
        while(sueldo != 0){
            System.out.println("Introduce el sueldo del trabajador "+ ++cont+" : ");
            sueldo = scan.nextFloat();
            if(sueldo == 0) break;
            if(sueldo < 1000)cont999++;
            if(sueldo >= 1000 && sueldo <=1750)cont1750++;
        }

        System.out.println("Sueldos entre 1000 y 1750: "+cont1750);
        System.out.println("Porcentaje de sueldos infgerior a 1000: "+ ((cont999*100)/cont)+"%");
    }
}
