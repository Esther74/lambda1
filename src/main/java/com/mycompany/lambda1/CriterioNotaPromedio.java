/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lambda1;

/**
 *
 * @author Esther
 */
public class CriterioNotaPromedio implements Criterio <Alumno>{

    @Override
    public int ordenar(Alumno a, Alumno b) {
        double diferencia = a.getNotaPromedio() - b.getNotaPromedio();
        return diferencia > 0? 1: diferencia < 0 ? -1 : 0;
    }
    
}
