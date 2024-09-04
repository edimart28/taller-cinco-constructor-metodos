import java.util.Scanner;

public class Ejecucion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operacion operacion = new Operacion(100, 50);


        System.out.println("Elija la operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + operacion.suma());
                break;
            case 2:
                System.out.println("Resultado de la resta: " + operacion.resta());
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + operacion.multiplicacion());
                break;
            case 4:
                System.out.println("Resultado de la division: " + operacion.divsion());
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();

    }


    }

