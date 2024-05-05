import java.util.Scanner;

/**
 * Programa que pida un mes al usuario en en formato numérico e indique el número de días de ese mes
 * (Supongamos que no hay años bisiestos).
 * @author cristina
 */
public class Ejercicio4PideUnMesEIndiqueNumeroDias {
    public static void main(String[] args) {
        //Intruccion que se utiliza para obtener la entrada del usuario por teclado.
        Scanner teclado = new Scanner(System.in);

        //Le pedimos al usuario que por favor introduzca el valor solicitado
        System.out.println("Introduce por favor un mes en formato numerico, ejemplo: Enero = (mes) 1");
        int mes = teclado.nextInt();

        //Realizamos una pequeña comprabación para que el usuario no intruduzca un numero mayor a 12 que seria Diciembre, o menor de 1
        //que seria Enero
        if (mes > 12 || mes <= 0){
            System.out.println("mes inválido"); //Si esto sucede que muestre un mensaje.
        }

        //Dependiendo del mes ingresado, se muestra el nombre del mes y la cantidad de días que tiene.

        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 dias");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
            default:
                System.out.println("Introduce un mes valido");
        }
        teclado.close();  //Una vez finalizado cerramos el teclado
    }
}
