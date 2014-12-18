import java.util.ArrayList;
import java.util.*;

public class Ejercicio3 {

	public static void main (String[] args) {

		ArrayList <Integer> numeros = new ArrayList <Integer> ();

		Scanner sc = new Scanner (System.in);
		int opcion = 0;

		do {

			System.out.println("------ MENÚ ------");
			System.out.println("1. Introducir dato");
			System.out.println("2. Modificar dato");
			System.out.println("3. Eliminar dato");
			System.out.println("4. Buscar dato");
			System.out.println("5. Mostrar datos");
			System.out.println("6. Salir");
			System.out.print("Seleccionar una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

				case 1: {

					System.out.print("Introduce un dato: ");
					numeros.add(sc.nextInt());

					break;
				}

				case 2: {

					System.out.print("Introduce el dato a modificar: ");
					int mod = sc.nextInt();

					for (int a=0; a<numeros.size(); a++) {

						if (mod == numeros.get(a)) {

							System.out.println("Valor antes de modificar: " + numeros.get(a));
							System.out.print("Introduce el nuevo valor: ");
							int nuevo = sc.nextInt();

							numeros.set(a, nuevo);
						}
					}
					break;
				}

				case 3: {

					System.out.print("Introduce el dato a eliminar: ");
					int borrar = sc.nextInt();

					for (int b=0; b<numeros.size(); b++){

						if (borrar == numeros.get(b)){

							System.out.println("Posición " + b + ": " + numeros.get(b));
							System.out.print("Introduce la posición a eliminar: ");
							int posicionborrar = sc.nextInt();
							numeros.remove(posicionborrar);
						}
					}
					break;
				}

				case 4: {

					System.out.print("Introduce el dato a buscar: ");
					int buscar = sc.nextInt();

					for (int bs=0; bs<numeros.size(); bs++){

						if (buscar == numeros.get(bs)){

							System.out.println("Posición " + bs + ": " + numeros.get(bs));
						}
					}
					break;
				}

				case 5: {

					System.out.println("Datos ArrayList:");
					for (int d=0; d<numeros.size(); d++){

						System.out.println("Posición " + d + ": " + numeros.get(d));
					}
					break;
				}

				case 6: {

					System.out.println("Has decidido salir.");
					break;
				}
			}
		} while (opcion != 6);
	}
}