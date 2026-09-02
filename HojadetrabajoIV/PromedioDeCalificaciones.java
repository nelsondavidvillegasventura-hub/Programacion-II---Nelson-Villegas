import java.util.ArrayList;
import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("Cuantas calificaciones desea ingresar? ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            calificaciones.add(nota);
        }

        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        double promedio = suma / calificaciones.size();

        System.out.println("\nCalificaciones ingresadas: " + calificaciones);
        System.out.printf("El promedio es: %.2f%n", promedio);

        sc.close();
    }
}
