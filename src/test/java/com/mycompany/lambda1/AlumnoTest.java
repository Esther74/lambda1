/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lambda1;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Esther
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testFechaEuropea() {
       Alumno[] clase = {new Alumno ("rut", "caballero", LocalDate.of(1971, Month.MARCH, 21),5.0)};
       
         
         System.out.println(clase[0].getFechaNacimientoEuropea());
         String fechaEu = clase[0].getFechaNacimientoEuropea();
         assertTrue("21/03/1971".equals(fechaEu));
         
         
         
    }
    
    
    @Test
    public void testEdad() {
       Alumno[] clase = {new Alumno ("rut", "caballero", LocalDate.of(1971, Month.MARCH, 21),5.0)};
       assertTrue(clase[0].getEdad()==50);
         
         
    }
    
}
