package model;

public class Curso {
    private int codigo;
    private String nombre;
    private char jornada;

public Curso(int pCodigo, String pCombre, char pJornada) {
    super();
    this.codigo = pCodigo;
    this.nombre = pCombre;
    this.jornada = pJornada;

}

public int getCodigo() {
    return codigo;
}
public String getNombre() {
    return nombre;
}
public char getJornada() {
    return jornada;
}
}



