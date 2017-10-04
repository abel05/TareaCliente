/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5.pkg3;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner scan = new Scanner(System.in);
		String cadena, subcadena;
		int pos=0, apari=0;
		System.out.println("Introduzca la cadena en la que buscar: ");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		subcadena = scan.nextLine();
		System.out.println();
		while (pos>=0){				
			pos = cadena.indexOf(subcadena, pos);			
			if (pos >= 0){
				pos++;
				apari++;
			}
		}		
		System.out.println("Aparece:  " + apari + " veces");
    }
    
}
