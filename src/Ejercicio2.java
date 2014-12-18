import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

	public static void main (String[] args) {

		ArrayList <Integer> numeros = new ArrayList <Integer> (5);

		numeros.add(6);
		numeros.add(0);
		numeros.add(3);
		numeros.add(-6);
		numeros.add(-2);

		int aa;

		System.out.println("Numero desordenados según arrayList: ");
		for (int n=0; n<numeros.size(); n++) {

			System.out.println("Posición arrayList " + n + ": " + numeros.get(n));
		}

		// Método para ordenar
		Collections.sort(numeros);

		System.out.println();

		System.out.println("Numero ordenados según método: ");
		for (int n=0; n<numeros.size(); n++) {

			System.out.println("Posición arrayList " + n + ": " + numeros.get(n));
		}

		System.out.println();

		for (int i=0; i<numeros.size(); i++) {

			for (int a=i; a<numeros.size(); a++) {

				if (numeros.get(a) < numeros.get(i)) {

					aa = numeros.get(i);
					numeros.set(i, numeros.get(a));
					numeros.set(a, aa);
				}
			}
		}

		System.out.println("Numero ordenados con for: ");

		for (int n=0; n<numeros.size(); n++) {

			System.out.println("Posición arrayList " + n + ": " + numeros.get(n));
		}
	}
}