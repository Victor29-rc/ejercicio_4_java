/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_java;

/**
 *
 * @author Victor Rosario
 */
public class Ejercicio4_Java {

    public static void main(String[] args) {
        
        Serie serie1 = new Serie();
        
        serie1.setCreador("Jose");
        serie1.setGenero("Accion");
        serie1.setTitulo("El hombre invencible");
        
        serie1.ToString();
        
        Serie serie2 = new Serie("retardados", "Lara justice");
        serie2.setGenero("Comedia");
        
        serie2.ToString();
        
        Serie serie3 = new Serie("El fragmento restante", 5, "Suspenso", "Victor");
        
        serie3.ToString();
        
      
        
    }
    
}
