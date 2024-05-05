package PrimeraEvaluacion;

import java.util.Scanner;

/**
 * Pequeño programa en el cual se piden dos numeros al usuario y debe mostrar su division si el segundo
 * no es cero, o mostrando un mensaje de aviso en caso contrario
 * @author cristina
 */
public class Ejercicio3DivisionDeDosNumeros {
    public static void main(String[] args) {
        //Instruccion que se utiliza para obtener la entrada del usuario por teclado
        Scanner teclado = new Scanner(System.in);

        //Se pide al usuario que introduzca el primer numero
        System.out.println("Introduce el primer numero:");
        int numeroUno = teclado.nextInt();
        //Lo mismo con el segundo numero
        System.out.println("Introduce el segundo numero:");
        int numeroDos = teclado.nextInt();

        //Establezco una condicion para el numeroDos, que si es = 0 , muestre un mensaje de error
        if (numeroDos == 0){
            System.out.println("Error, no se puede dividir entre (0)");
        }else{
            //En caso contrario que me muestre el resultado de la division, lo guardo en una variable de tipo double, por si
            //la division da decimales
            double resultado = (double) numeroUno/numeroDos;
            System.out.println("El resultado de la división es: " +resultado);
        }

        teclado.close();


    }
}
