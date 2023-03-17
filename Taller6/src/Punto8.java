import java.util.Scanner;

public class Punto8 {
    static int[] arregloA;
    static int[] arregloB;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        // Ciclo para permitir al usuario elegir diferentes opciones hasta que elige salir
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("A. Ingresar Arreglo A");
            System.out.println("B. Ingresar Arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostrar A * B");
            System.out.println("F. Salir");

            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'A':
                    ingresarArregloA(scanner);
                    break;
                case 'B':
                    ingresarArregloB(scanner);
                    break;
                case 'C':
                    mostrarSuma();
                    break;
                case 'D':
                    mostrarResta();
                    break;
                case 'E':
                    mostrarMultiplicacion();
                    break;
                case 'F':
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 'F');
    }

    private static void mostrarMultiplicacion() {
		
		
	}

	// Método para ingresar los valores del arreglo A
    public static void ingresarArregloA(Scanner scanner) {
        arregloA = new int[5];
        System.out.println("Ingrese los valores del arreglo A:");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arregloA[i] = scanner.nextInt();
        }
    }

    // Método para ingresar los valores del arreglo B
    public static void ingresarArregloB(Scanner scanner) {
        arregloB = new int[5];
        System.out.println("Ingrese los valores del arreglo B:");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arregloB[i] = scanner.nextInt();
        }
    }

    // Método para mostrar la suma de los arreglos A y B
    public static void mostrarSuma() {
        if (arregloA == null || arregloB == null) {
            System.out.println("Ingrese los valores de los arreglos primero");
        } else {
            int[] suma = new int[5];
            for (int i = 0; i < suma.length; i++) {
                suma[i] = arregloA[i] + arregloB[i];
            }
            System.out.println("La suma de A y B es:");
            mostrarArreglo(suma);
        }
    }

    private static void mostrarArreglo(int[] suma) {
	
		
	}

	// Método para mostrar la resta de los arreglos A y B
    public static void mostrarResta() {
        if (arregloA == null || arregloB == null) {
            System.out.println("Ingrese los valores de los arreglos primero");
        } else {
            int[] resta = new int[5];
            for (int i = 0; i < resta.length; i++) {
                resta[i] = arregloA[i] - arregloB[i];
            }
            System.out.println();
        }
    }
}
    
