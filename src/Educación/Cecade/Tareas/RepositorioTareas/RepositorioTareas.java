package Educación.Cecade.Tareas.RepositorioTareas;

import Educación.Cecade.Tareas.Modelo.Tarea;
import java.util.List;

public interface RepositorioTareas {
    void agregarTarea(Tarea var1);

    void agregarTarea(RepositorioTareas var1);

    List<Tarea> listarTareas();

    Tarea buscarTareaPorId(int var1);

    void actualizarEstadoTarea(int var1, String var2);
}