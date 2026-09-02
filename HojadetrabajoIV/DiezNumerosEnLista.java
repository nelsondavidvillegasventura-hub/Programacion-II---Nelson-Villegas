import java.util.ArrayList;
import java.util.Scanner;

public class DiezNumerosEnLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = sc.nextInt();
            numeros.add(num);
        }

        System.out.println("\nLos numeros ingresados son:");
        for (int n : numeros) {
            System.out.println(n);
        }

        sc.close();
    }
}
