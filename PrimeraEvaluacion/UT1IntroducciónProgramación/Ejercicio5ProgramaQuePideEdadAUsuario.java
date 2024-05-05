package PrimeraEvaluacion;

import java.util.Scanner;

/**
 * Programa que solicita al usuario su edad. Debe mostrarse un mensaje según la
 * siguiente clasificación: Niñez (entre 0 y 12 años), Adolescencia (entre 13 y 18 años), Juventud (entre
 * 19 y 33 años), Madurez (entre 34 y 65), Jubilación (entre 66 y 79 años), Tercera Edad (+80 años).
 *
 * @author cristina
 */

public class Ejercicio5ProgramaQuePideEdadAUsuario {
    public static void main(String[] args) {
        //Intruccion para recibir por teclado la entrada del usuario.
        Scanner teclado = new Scanner(System.in);
        //Pedimos al usuario que introduzca la edad
        System.out.println("Introduce una edad por favor");
        int edad = teclado.nextInt();

        //Hay de establecer varias condiciones para verificar a que grupo de edad corresponde.

        if (edad < 0) {
            System.out.println("Has introducido una edad no válida.");
        } else if (edad <= 12) {
            System.out.println("Niñez");
        } else if (edad <= 18) {
            System.out.println("Adolescencia");
        } else if (edad <= 33) {
            System.out.println("Juventud");
        } else if (edad <= 65) {
            System.out.println("Madurez");
        } else if (edad <= 79) {
            System.out.println("Jubilación");
        } else {
            System.out.println("Tercera edad: " + edad);
        }
    }
}
