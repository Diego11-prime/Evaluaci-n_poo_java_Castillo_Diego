package Educación.Cecade.Tareas.servicio;

import Educación.Cecade.Tareas.Modelo.Estudiante;
import Educación.Cecade.Tareas.Modelo.Tarea;
import Educación.Cecade.Tareas.RepositorioTareas.RepositorioMemoriaArrayList;
import Educación.Cecade.Tareas.RepositorioTareas.RepositorioTareas;
import Educación.Cecade.Tareas.util.Validador;
import java.util.List;

public class ServicioTareas {
    private RepositorioTareas repositorio;

    public ServicioTareas(RepositorioMemoriaArrayList repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarTarea(Tarea tarea) {
        if (Validador.validarTarea(tarea)) {
            this.repositorio.agregarTarea(tarea);
        } else {
            throw new IllegalArgumentException("Datos de tarea inválidos");
        }
    }

    public List<Tarea> listarTareas() {
        return this.repositorio.listarTareas();
    }

    public void marcarTareaEntregada(int idTarea) {
        this.repositorio.actualizarEstadoTarea(idTarea, "Entregada");
    }

    public double calcularPorcentajeEntrega(Estudiante estudiante, int totalTareas) {
        return totalTareas == 0 ? (double)0.0F : (double)estudiante.getTareasEntregadas() / (double)totalTareas * (double)100.0F;
    }
}
