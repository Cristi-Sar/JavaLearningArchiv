import java.util.Scanner;

/**
 * Programa que solicita al usuario 3 numeros y los ordena de mayor a mayor a menor
 *
 * @author cristina
 */
public class Ejercicio6ProgramaQuePideTresNumerosYLosOrdena {
    public static void main(String[] args) {
        //Intrusccion para recibir por teclado la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        //Pedimos que ingrese los numeros correspondientes
        System.out.println("Introduce un numero");
        int numeroUno = teclado.nextInt();
        System.out.println("Introduce segundo numero");
        int numeroDos = teclado.nextInt();
        System.out.println("Introduce tercer numero");
        int numeroTres = teclado.nextInt();
        int numeroMenor, numeroMediano, numeroMayor;


        // Determinar el número mayor de los 3 numeros y ordenanarlos de menor

        if (numeroUno >= numeroDos && numeroUno >= numeroTres) {
            numeroMayor = numeroUno;
            if (numeroDos >= numeroTres) {
                numeroMediano = numeroDos;
                numeroMenor = numeroTres;
            } else {
                numeroMediano = numeroTres;
                numeroMenor = numeroDos;
            }
        } else if (numeroDos >= numeroUno && numeroDos >= numeroTres) {
            numeroMayor = numeroDos;
            if (numeroUno >= numeroTres) {
                numeroMediano = numeroUno;
                numeroMenor = numeroTres;
            } else {
                numeroMediano = numeroTres;
                numeroMenor = numeroUno;
            }
        } else {
            numeroMayor = numeroTres;
            if (numeroUno >= numeroDos) {
                numeroMediano = numeroUno;
                numeroMenor = numeroDos;
            } else {
                numeroMediano = numeroDos;
                numeroMenor = numeroUno;
            }
        }

        // Mostrar los resultados de cada numero

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número mediano es: " + numeroMediano);
        System.out.println("El número menor es: " + numeroMenor);

        // Cerrar el scanner

        teclado.close();
    }

}

