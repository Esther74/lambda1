/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lambda1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Esther
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private double notaPromedio;
    private int edad;
    
    
    
    
    //constructor
    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, double notaPromedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notaPromedio = notaPromedio;
        
        LocalDate actual = LocalDate.now();
        int dif = actual.compareTo(fechaNacimiento);
        this.edad=dif;
    }
    
    //fecha europea
    
    private String fechaEuropea(LocalDate fecha){
        String fechae = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechae;
    }
    
    
    //to string
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimientoeuropea=" + this.fechaEuropea(fechaNacimiento) + ", notaPromedio=" + notaPromedio + ", edad=" + edad + '}';
    }

    //get set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    //convierto la fecha en un string y la muestro en formato europeo
    public String getFechaNacimientoEuropea() {
        return this.fechaEuropea(fechaNacimiento);
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
    
    //get set 

    public int getEdad() {
        return edad;
    }

    
    
    
}
