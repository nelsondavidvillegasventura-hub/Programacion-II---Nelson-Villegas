import java.util.ArrayList;
import java.util.Scanner;

public class FiltrarNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        System.out.print("Cuantos numeros desea ingresar? ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            int num = sc.nextInt();
            numeros.add(num);
        }

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        System.out.println("\nLista completa: " + numeros);
        System.out.println("Numeros pares: " + pares);

        sc.close();
    }
}
