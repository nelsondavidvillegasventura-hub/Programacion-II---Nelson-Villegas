import java.util.ArrayList;
import java.util.Scanner;

public class MenuAgregarEliminarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por indice");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = sc.nextLine();
                    lista.add(elemento);
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    System.out.println("Lista actual: " + lista);
                    System.out.print("Ingrese el indice a eliminar: ");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Indice invalido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista actual: " + lista);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
