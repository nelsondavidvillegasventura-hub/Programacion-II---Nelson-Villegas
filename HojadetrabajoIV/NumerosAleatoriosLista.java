import java.util.ArrayList;
import java.util.Random;

public class NumerosAleatoriosLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1; // numeros entre 1 y 100
            numeros.add(num);
        }

        System.out.println("Numeros aleatorios generados:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
