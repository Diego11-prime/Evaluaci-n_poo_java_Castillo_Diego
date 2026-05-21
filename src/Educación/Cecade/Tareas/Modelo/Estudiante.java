package Educación.Cecade.Tareas.Modelo;

import java.io.PrintStream;

public class Estudiante extends Usuario {
    private int tareasEntregadas = 0;

    public Estudiante(String nombre, String codigo, String grado) {
        super(nombre, codigo, grado);
    }

    public int getTareasEntregadas() {
        return this.tareasEntregadas;
    }

    public void setTareasEntregadas(int tareasEntregadas) {
        this.tareasEntregadas = tareasEntregadas;
    }

    public void mostrarDatos() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println("Estudiante: " + var10001 + " | Código: " + this.getCodigo() + " | Grado: " + this.getGrado() + " | Tareas entregadas: " + this.tareasEntregadas);
    }
}
