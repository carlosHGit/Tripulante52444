package model;

/**----------------------
    *     Tripulante
     ------------------------*/

public class Tripulante {
    /**
     * Atributos
     */

    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion; 
    private String email;    
    
    /** Getters */
    public String getEmail() {
        return email;
    }

    public float getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }    
    
    /** Setters */
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroIdentificacion(float numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getAverage() {
        return ((nota1 + nota2 + nota3)/3);
    }

    public double getHighNote(){
        if (nota3 >= nota2 && nota3 >= nota1) {
            return nota3;            
        }else if(nota2 >= nota3 && nota2 >= nota1){
            return nota2;
        }
        return nota1;
        
    }

    public double getLowNote(){
        if (nota3 <= nota2 && nota3 <= nota1) {
            return nota3;            
        }else if(nota2 <= nota3 && nota2 <= nota1){
            return nota2;
        }
        return nota1;        
    }

    public boolean checkIfPass() {
        if (getAverage()>3.5) {
            return true;
        } else {
            return false;            
        }
        
    }
    
    
    
}
