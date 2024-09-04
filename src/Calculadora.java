import java.util.Scanner;

public class Calculadora {

    int valor1;
    int valor2;

    public Calculadora (int valor1, int valor2) {

        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public int suma() {
        return valor1 + valor2;

    }

    public int resta() {
        return valor1 - valor2;
    }

    public int multiplicacion() {
        return valor1 * valor2;
    }

    public int divsion() {
        return valor1 / valor2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int valor2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora(valor1, valor2);

        System.out.println("Elija la operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + calculadora.suma());
                break;
            case 2:
                System.out.println("Resultado de la resta: " + calculadora.resta());
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + calculadora.multiplicacion());
                break;
            case 4:
                System.out.println("Resultado de la division: " + calculadora.divsion());
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();

    }

}







