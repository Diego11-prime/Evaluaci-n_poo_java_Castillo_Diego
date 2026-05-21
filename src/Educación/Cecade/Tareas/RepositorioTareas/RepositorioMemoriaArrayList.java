package Educación.Cecade.Tareas.RepositorioTareas;

import Educación.Cecade.Tareas.Modelo.Tarea;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoriaArrayList implements RepositorioTareas {
    private List<Tarea> listaTareas = new ArrayList();

    public void agregarTarea(Tarea tarea) {
        this.listaTareas.add(tarea);
    }

    public void agregarTarea(RepositorioTareas tarea) {
    }

    public List<Tarea> listarTareas() {
        return new ArrayList(this.listaTareas);
    }

    public Tarea buscarTareaPorId(int id) {
        for(Tarea tarea : this.listaTareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }

        return null;
    }

    public void actualizarEstadoTarea(int id, String estado) {
        Tarea tarea = this.buscarTareaPorId(id);
        if (tarea != null) {
            tarea.setEstado(estado);
            if (estado.equals("Entregada")) {
                tarea.getEstudianteAsignado().setTareasEntregadas(tarea.getEstudianteAsignado().getTareasEntregadas() + 1);
            }
        }

    }
}
