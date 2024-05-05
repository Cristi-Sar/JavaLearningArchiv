package PrimeraEvaluacion;

import java.util.Scanner;
/**
 Programa que comprueba si un numero es mayor que otro y si son iguales
 * @author cristina
 */
public class Ejercicio2VerificaSiUnNumeroEsMayor {
    public static void main(String[] args) {
        //Instruccion que se utiliza para obtener la entrada del usuario por teclado
        Scanner teclado = new Scanner(System.in);
        //Mostramos un mensaje al usuario solicitando la entrada del primer numero
        System.out.println("Introduce primer número:");
        //Guardamos el valor de lo que recibimos en la variable(numeroUno).
        int numeroUno = teclado.nextInt();
        //Repetimos el paso anterior
        System.out.println("Introduce segundo número:");
        int numeroDos = teclado.nextInt();

        //Establezco una condicion para verificar si el numeroUno es mayor que numeroDos
        if (numeroUno > numeroDos) {
            System.out.println("El número mayor es: " + numeroUno + " y el número menor es " + numeroDos);
            //Pregunto lo contrario
        } else if (numeroUno < numeroDos) {
            System.out.println("El número mayor es: " + numeroDos + " y el número menor es " + numeroUno);
            // Ambos numeros son iguales
        } else {
            System.out.println("Ambos números son iguales: " + numeroUno);
        }

        teclado.close();
    }
}
