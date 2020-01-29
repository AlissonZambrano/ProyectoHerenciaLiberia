/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.adultos;

import libreria.Libro;

/**
 *
 * @author PC-03
 */
public class Novela extends Libro{
    private int numEpisodios;
    //Constructores
    public Novela(){
        
    }
    public Novela (String tit, int nPag, double precio,int ne){
        super(tit,nPag,precio);
        this.numEpisodios=ne;
    }
    @Override
    public String toString(){
        return super.toString()+"\nN.espisodios: "+this.numEpisodios;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("\nNovela: "+this.toString());
        //super.toString(); ----> Llamada al toString de la clase padre (Libro)
        //this.toString():----> Llamada al toString de esta misma clase (Novelas)
    }

    @Override
    public void calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
