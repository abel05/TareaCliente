/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.pkg3;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i, N;
        int contMay = 0, contMenor = 0;
        double media = 0;
        //Leer el número de personas
        do{
            System.out.print("Número de personas: ");
            N = sc.nextInt();
        }while(N<=0);
        //Se crea el array de tamaño N
        double[] alto = new double[N];
        //Leer alturas
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; //se suma la estatura leída para calcular la media
        }
        //Calcular la media
        media = media / N;
        //recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMay++;
            } else if (alto[i] < media){ //si es menor
                contMenor++;
            }
        }
        //Mostrar resultados
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMay);
        System.out.println("Personas con estatura inferior a la media: " + contMenor);
    
    }
    
}
