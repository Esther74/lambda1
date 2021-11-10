/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lambda1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Esther
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno[] clase = {new Alumno("rut","caballero",LocalDate.of(1971, Month.MARCH, 21),5.5),
                         new Alumno("maria","monjas",LocalDate.of(1974, Month.JUNE, 30),9.5),
                         new Alumno("bego","gonzalez",LocalDate.of(1974, Month.OCTOBER, 30),9.5),
                         new Alumno("belen","zalama",LocalDate.of(1974, Month.JANUARY, 16),8.5),
                         new Alumno("esther","santos",LocalDate.of(1974, Month.JANUARY, 13),5.5),
                         new Alumno("nuria","gonzalez",LocalDate.of(1974, Month.OCTOBER, 30),10.0),
                         new Alumno("patricia","corbe",LocalDate.of(1972, Month.DECEMBER, 2),4.0)};
        
        
        //EXPRESIONES LAMBDA
        System.out.println("---------------------------------------");
        System.out.println("Ordenar array por apellidos");
        Util.imprimirArr(clase);
        Criterio<Alumno> criterioapellidos = (a,b) -> a.getApellido().compareTo(b.getApellido());
        
        Util.ordenarArr(clase,criterioapellidos);
        Util.imprimirArr(clase);
        
        //criterio ordeno por nota de mayor a menor
        System.out.println("---------------------------------------");
        System.out.println("Ordenar array por nota promedio");
        Util.imprimirArr(clase);
        Criterio<Alumno> criterionota = (a,b) -> {
                        double diferencia = b.getNotaPromedio() - a.getNotaPromedio();
                        return diferencia > 0? 1: diferencia < 0 ? -1 : 0;
                    };
        Util.ordenarArr(clase, criterionota);
        Util.imprimirArr(clase);
        
        //Criterio ordenar por fecha de nacimiento
        System.out.println("---------------------------------------");
        System.out.println("Ordenar array por fecha de nacimiento");
        Util.imprimirArr(clase);
        Criterio<Alumno> criteriofecha = (a,b)-> a.getFechaNacimiento().compareTo(b.getFechaNacimiento());
        Util.ordenarArr(clase, criteriofecha);
        Util.imprimirArr(clase);
        
        
    }
        
    }
    

