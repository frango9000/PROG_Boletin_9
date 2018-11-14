/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_9_3;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Rectangulo {
    private float lado1;
    private float lado2;

    Rectangulo() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Introduce lado 1");
            lado1 = scan.nextFloat();
        } while (lado1 <= 0);

        do {
            System.out.println("Introduce lado 2");
            lado2 = scan.nextFloat();
        } while (lado1 <= 0);

    }

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    float calcArea() {
        return lado1 * lado2;
    }

    public void mostrarArea(){
        //JOptionPane.showMessageDialog(null, "Rectangulo: \nlado1 : "+lado1+"\nlado 2 : "+lado2+"\nArea  =  "+calcArea(), "Boletin_6_7 - Rectangulo", 1);
    }

    public float calcSumaLados() {
        return 2*(lado1 + lado2);
    }

}