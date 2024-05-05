package PrimeraEvaluacion;

import java.util.Scanner;

/**
 *  Clase que verifica si un número entero es par o impar.
 * Pequeño programa que verifica si un numero es Par o Impar
 * Un numero es Par si es divisible entre 2 y su rediduo == 0
 * @author cristina
 *
 */
public class Ejercicio1VerificaSiUnNumeroEsParOImpar {

    public static void main(String[] args) {
        //Instruccion que se utiliza para obtener la entrada del usuario por teclado.
        Scanner teclado = new Scanner(System.in);
        //Pedimos por teclado al usuario que nos ingrese un numero.
        System.out.println("Introduce un numero");
        //Variable de tipo privimitivo entero en el que guardaremos el valor que recibimos por teclado del usuario
        int numero = teclado.nextInt();

        //Establezco una condicion para validar si un numero en Par o Impar.
        if (numero %2 == 0){  //Si es Par mostrara dicho numero
            System.out.println("numero es Par = " + numero);
        }else{ //De lo contrario mostrara el numero Impar
            System.out.println("numero es Impar = " + numero);
        }
    }
}
