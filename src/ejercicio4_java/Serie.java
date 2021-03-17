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
public class Serie {
    String titulo;
    int numeroDeTemporadas = 3;
    boolean entregado = false;
    String genero;
    String creador;
    
    public Serie(){}
    
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    
    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }
    
    public String getTitulo(){ return titulo; }
    public int getNumeroDeTemporadas(){ return numeroDeTemporadas; }
    public String getGenero() { return genero; }
    public String getCreador() { return creador; }
     
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setNumeroDeTemporadas(int numeroDeTemporadas){ this.numeroDeTemporadas = numeroDeTemporadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCreador(String creador) { this.creador = creador; }
    
    public void ToString(){
         System.out.println
            ("Titulo: " + titulo + "\n" +
             "Numero de temporadas: " + numeroDeTemporadas + "\n" +
             "Entregado: " + entregado + "\n" +
             "Genero: " + genero + "\n" + 
             "Creador: " + creador + "\n"      
            );
    }
}
