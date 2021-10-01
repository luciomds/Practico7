/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia ingles = new Materia(1, "Ingles I", 1);
        Materia mate = new Materia(2, "Matematica",1);
        Materia lab = new Materia(3, "Laboratorio I",1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(ingles);
        a1.agregarMateria(mate);
        a1.agregarMateria(lab);
        
        a2.agregarMateria(ingles);
        a2.agregarMateria(mate);
        a2.agregarMateria(lab);
        a2.agregarMateria(new Materia(3, "Laboratorio I",1));
        
        System.out.println("alumno 1: cant materias "+a1.cantidadMaterias());
        System.out.println("alumno 2: cant materias "+a2.cantidadMaterias());
    }
    
}
