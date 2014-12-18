import java.util.Arrays;

public class Ejercicio1 {

	public static void main (String[] args) {

		int [] numeros = {-2, 5, 0, -6, 6};
		int aa;

		System.out.println("Numero desordenados según array: ");
		for (int n=0; n<numeros.length; n++) {

			System.out.println("Posición array " + n + ": " + numeros[n]);
		}

		// Método para ordenar
		Arrays.sort(numeros);

		System.out.println();

		System.out.println("Numero ordenados según método: ");
		for (int n=0; n<numeros.length; n++) {

			System.out.println("Posición método " + n + ": " + numeros[n]);
		}

		System.out.println();

 		for (int i=0; i<numeros.length; i++) {

			for (int a=i; a<numeros.length; a++) {

				if (numeros[a] < numeros[i]) {

					aa = numeros[i];
					numeros[i] = numeros[a];
					numeros[a] = aa;
				}
			}
		}

		System.out.println("Numero ordenados con for: ");
		for (int n=0; n<numeros.length; n++) {

			System.out.println("Posición método " + n + ": " + numeros[n]);
		}
	}
}