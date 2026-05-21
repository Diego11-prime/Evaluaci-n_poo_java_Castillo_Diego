package Educación.Cecade.Tareas.util;

import Educación.Cecade.Tareas.Modelo.Tarea;

public class Validador {
    public static boolean validarTarea(Tarea tarea) {
        return tarea != null && tarea.getTitulo() != null && !tarea.getTitulo().isEmpty() && tarea.getDescripcion() != null && !tarea.getDescripcion().isEmpty() && tarea.getFechaEntrega() != null && tarea.getEstudianteAsignado() != null;
    }
}
