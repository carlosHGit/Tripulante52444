package views;

import model.Curso;

public class Vista {
    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "frances 101", 'N', 7400, "Jairo");
        Curso cursoItaliano = new Curso(52442, "italiano 102", 'D',7401, "Gabriel");

        System.out.println(cursoFrances.getCodigo());        
        System.out.println(cursoFrances.getJornada());        
        System.out.println(cursoFrances.getNombre());    

        System.out.println(cursoItaliano.getCodigo());        
        System.out.println(cursoItaliano.getJornada());        
        System.out.println(cursoItaliano.getNombre());        
    }
}
