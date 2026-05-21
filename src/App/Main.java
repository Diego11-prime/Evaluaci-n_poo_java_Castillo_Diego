package App;

import edu.cecace.tareas.modelo.Docente;
import edu.cecace.tareas.modelo.Estudiante;
import edu.cecace.tareas.modelo.Tarea;
import edu.cecace.tareas.RepositorioTareas.RepositorioMemoriaArrayList;
import edu.cecace.tareas.servicio.ServicioTareas;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioMemoriaArrayList repositorio = new RepositorioMemoriaArrayList();
        ServicioTareas servicio = new ServicioTareas(repositorio);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        new Docente("María López", "D001", "5to Grado", "Matemáticas");
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "E001", "5to Grado");
        Estudiante estudiante2 = new Estudiante("Ana Gómez", "E002", "5to Grado");

        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE TAREAS ESCOLARES ===");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como entregada");
            System.out.println("4. Ver porcentaje de entrega de estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("ID de tarea: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Fecha de entrega (dd/MM/yyyy): ");
                        Date fecha = formatoFecha.parse(scanner.nextLine());
                        System.out.print("Código de estudiante asignado: ");
                        String codEst = scanner.nextLine();
                        Estudiante est = codEst.equals("E001") ? estudiante1 : estudiante2;
                        Tarea tarea = new Tarea(id, titulo, descripcion, fecha, est);
                        servicio.registrarTarea(tarea);
                        System.out.println("Tarea registrada correctamente");
                    } catch (ParseException var16) {
                        System.out.println("Formato de fecha incorrecto");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    List<Tarea> tareas = servicio.listarTareas();
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas");
                    } else {
                        System.out.println("\n--- Lista de tareas ---");

                        for(Tarea t : tareas) {
                            PrintStream var26 = System.out;
                            int var27 = t.getId();
                            var26.println("ID: " + var27 + " | Título: " + t.getTitulo() + " | Estado: " + t.getEstado() + " | Entrega: " + formatoFecha.format(t.getFechaEntrega()) + " | Estudiante: " + t.getEstudianteAsignado().getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID de tarea: ");
                    int idTarea = scanner.nextInt();
                    servicio.marcarTareaEntregada(idTarea);
                    System.out.println("Estado actualizado");
                    break;
                case 4:
                    System.out.print("Código de estudiante: ");
                    String cod = scanner.nextLine();
                    Estudiante est = cod.equals("E001") ? estudiante1 : estudiante2;
                    int totalTareas = servicio.listarTareas().size();
                    double porcentaje = servicio.calcularPorcentajeEntrega(est, totalTareas);
                    PrintStream var10000 = System.out;
                    String var10001 = est.getNombre();
                    var10000.println("Porcentaje de entrega de " + var10001 + ": " + porcentaje + "%");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 5);

        scanner.close();
    }
}
