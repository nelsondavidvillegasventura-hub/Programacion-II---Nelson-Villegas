import java.util.ArrayList;
import java.util.Scanner;

public class PromedioSalariosEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("Cuantos empleados desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el salario de " + nombre + ": ");
            double salario = sc.nextDouble();
            sc.nextLine();
            empleados.add(new Empleado(nombre, salario));
        }

        double suma = 0;
        System.out.println("\nLista de empleados:");
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " - Q" + emp.getSalario());
            suma += emp.getSalario();
        }

        double promedio = suma / empleados.size();
        System.out.printf("\nEl promedio de salarios es: Q%.2f%n", promedio);

        sc.close();
    }
}
