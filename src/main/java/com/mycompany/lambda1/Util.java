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
public class Util{
    
    
    public static <T> void ordenarArr(T arr[], Criterio cr){
        for (int n = 0; n < arr.length; n++ ){
            for(int i=0; i < arr.length - 1; i++){
                if(cr.ordenar(arr[i], arr[i+1]) > 0){
                    T aux = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=aux;
                }
            }
        }
    }
    
    
    public static void imprimirArr(Alumno [] arr){
        System.out.println("------------------------------");
        for (int i=0; i < arr.length; i++ ){
            
            System.out.println(arr[i]);
        }
    }
    
}
