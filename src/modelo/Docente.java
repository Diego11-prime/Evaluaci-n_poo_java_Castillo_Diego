package modelo;

import java.io.PrintStream;

public class Docente extends Usuario {
    private String materia;

    public Docente(String nombre, String codigo, String grado, String materia) {
        super(nombre, codigo, grado);
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrarDatos() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println("Docente: " + var10001 + " | Código: " + this.getCodigo() + " | Grado: " + this.getGrado() + " | Materia: " + this.materia);
    }
}
