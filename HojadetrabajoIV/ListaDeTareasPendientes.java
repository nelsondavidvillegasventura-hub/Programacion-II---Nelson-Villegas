import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTareasPendientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- LISTA DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    System.out.println("Tareas actuales: " + tareas);
                    System.out.print("Ingrese el indice de la tarea completada: ");
                    int indiceCompletada = sc.nextInt();
                    if (indiceCompletada >= 0 && indiceCompletada < tareas.size()) {
                        String actual = tareas.get(indiceCompletada);
                        tareas.set(indiceCompletada, actual + " (Completada)");
                        System.out.println("Tarea marcada como completada.");
                    } else {
                        System.out.println("Indice invalido.");
                    }
                    break;
                case 3:
                    System.out.println("Tareas actuales: " + tareas);
                    System.out.print("Ingrese el indice de la tarea a eliminar: ");
                    int indiceEliminar = sc.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < tareas.size()) {
                        tareas.remove(indiceEliminar);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Indice invalido.");
                    }
                    break;
                case 4:
                    System.out.println("Tareas pendientes:");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println(i + ". " + tareas.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
