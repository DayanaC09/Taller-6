import java.util.Scanner;
public class Punto7 {
	public static void main(String[] args) {
		 int[] resultados = new int[5];
	        Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que ingrese los resultados de las pruebas
	        for (int i = 0; i < resultados.length; i++) {
	            System.out.print("Ingresa el resultado de la prueba " + (i+1) + ": ");
	            resultados[i] = scanner.nextInt();
	        }

	        // Calcular el promedio de los resultados
	        int sumaResultados = 0;
	        for (int i = 0; i < resultados.length; i++) {
	            sumaResultados += resultados[i];
	        }
	        double promedio = (double) sumaResultados / resultados.length;

	        // Imprimir el promedio de los resultados
	        System.out.println("El promedio de los resultados es: " + promedio);
		
	}

}
