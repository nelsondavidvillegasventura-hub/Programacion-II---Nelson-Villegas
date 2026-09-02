import java.util.ArrayList;
import java.util.Scanner;

public class IngresoElementosHastaFin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese elementos (escriba 'fin' para terminar):");
        while (true) {
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            elementos.add(entrada);
        }

        System.out.println("\nElementos ingresados:");
        for (String e : elementos) {
            System.out.println(e);
        }

        sc.close();
    }
}
