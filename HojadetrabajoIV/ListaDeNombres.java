import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("Cuantos nombres desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar el buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }

        System.out.println("\nLista de nombres ingresados:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        sc.close();
    }
}
