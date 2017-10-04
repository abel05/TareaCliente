/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.pkg1;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0; //contadores
        int i;
        
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            //System.out.print("numeros[" + i + "]= ");
            numeros[0] = 1;
            numeros[1] = 21;
            numeros[2] = -13;
            numeros[3] = 14;
            numeros[4] = 11;
            numeros[5] = 81;
            numeros[6] = 98;
            numeros[7] = -91;
            numeros[8] = -7;
            numeros[9] = 10;
                      
        }
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            }
        }
        //mostrar resultados
        System.out.println("Positivos: " + pos);
        
    }
    
}
