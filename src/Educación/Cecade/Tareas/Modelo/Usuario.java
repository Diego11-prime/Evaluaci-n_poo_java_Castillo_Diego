package Educación.Cecade.Tareas.Modelo;

public abstract class Usuario {
    private String nombre;
    private String codigo;
    private String grado;

    public Usuario(String nombre, String codigo, String grado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.grado = grado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return this.grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public abstract void mostrarDatos();
}
