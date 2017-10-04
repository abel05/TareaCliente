/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5.pkg1;

import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Tarea51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		int pos;
		char carter;
		String original, invertida = new String();
		System.out.println("Introduzca la cadena: ");
		original = scan.nextLine();
		pos = original.length() - 1;
		while (pos >= 0){
			carter = original.charAt(pos);
			invertida = invertida + carter;
			pos--;
		}
		System.out.println("Cadena invertida: " + invertida);
    }
    
}
