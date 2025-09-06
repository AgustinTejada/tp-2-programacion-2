/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class TrabajoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el ejercicio (1-13): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: Ejercicios.ejercicio1(); break;
            case 2: Ejercicios.ejercicio2(); break;
            case 3: Ejercicios.ejercicio3(); break;
            case 4: Ejercicios.ejercicio4(); break;
            case 5: Ejercicios.ejercicio5(); break;
            case 6: Ejercicios.ejercicio6(); break;
            case 7: Ejercicios.ejercicio7(); break;
            case 8: Ejercicios.ejercicio8(); break;
            case 9: Ejercicios.ejercicio9(); break;
            case 10: Ejercicios.ejercicio10(); break;
            case 11: Ejercicios.ejercicio11(); break;
            case 12: Ejercicios.ejercicio12(); break;
            case 13: Ejercicios.ejercicio13(); break;
        }
        sc.close();
    }
    
}
