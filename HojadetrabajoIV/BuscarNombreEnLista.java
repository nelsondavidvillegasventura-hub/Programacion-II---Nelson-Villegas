import java.util.ArrayList;
import java.util.Scanner;

public class BuscarNombreEnLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("Cuantos nombres desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres.add(sc.nextLine());
        }

        System.out.print("\nIngrese el nombre que desea buscar: ");
        String buscado = sc.nextLine();

        if (nombres.contains(buscado)) {
            System.out.println("El nombre \"" + buscado + "\" SI existe en la lista.");
        } else {
            System.out.println("El nombre \"" + buscado + "\" NO existe en la lista.");
        }

        sc.close();
    }
}
