/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
// * and open the template in the editor.
 */
package estructurasdatos;

import estructurasdatos.listas.Lista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sehjud
 */
public class EstructurasDatos{
    

    public EstructurasDatos() {
        
        Lista<Double> lista = new Lista<Double>();
        System.out.println(lista.estaVacia());
        lista.agregar(1.0);
        lista.agregar(2.0);
        lista.agregar(3.0);
        System.out.println(lista.borrar(2));
        System.out.println(lista.borrar(2));
  
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new EstructurasDatos();

        
    }

    
}
