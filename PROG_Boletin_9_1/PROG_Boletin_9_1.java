/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_9_1;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];        
        int numP=0, numN=0, numZ=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce 10 numeros: ");
        for(int i = 0;i<10;i++){
            System.out.println("numero "+(i+1)+": ");
            numeros[i]=scan.nextInt();
            if(numeros[i] > 0) numP++;
            if(numeros[i] < 0) numN++;
            if(numeros[i] == 0) numZ++;
            
        }
        
        System.out.println("Positivos: "+numP+"\nNegativos: "+numN+"\nZeros: "+numZ);
        
        
    }
    
}
