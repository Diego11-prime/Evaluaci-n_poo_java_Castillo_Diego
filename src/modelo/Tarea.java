package modelo;

import java.util.Date;

public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private Date fechaEntrega;
    private String estado;
    private Estudiante estudianteAsignado;

    public Tarea(int id, String titulo, String descripcion, Date fechaEntrega, Estudiante estudianteAsignado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.estado = "Pendiente";
        this.estudianteAsignado = estudianteAsignado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudianteAsignado() {
        return this.estudianteAsignado;
    }

    public void setEstudianteAsignado(Estudiante estudianteAsignado) {
        this.estudianteAsignado = estudianteAsignado;
    }
}
