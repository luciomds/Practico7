/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias=new ArrayList<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarMateria (Materia m){
        if(!(materias.contains(m))){
            materias.add(m);
            return true;
        }else{
            System.out.println("Ya se encuentra inscripto en la materia");
            return false;
        }
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.legajo;
        return hash;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
}
