/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author PC-03
 */
public abstract class Libro {

    protected String titulo;
    protected int nPag;
    protected double precio;

    public static final double VALORPAGINA = 0.05;

    //constructor
    public Libro() {

    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public Libro(String tit, int nPag, double precio) {
        this.titulo = tit;
        this.nPag = nPag;
        this.precio = precio;
    }

    //metodos
    //metodo heredado de la clase object
    //Sobreescrituraa de metodos: cambiar la implemmentacion de un metodo heredado
    @Override
    public String toString() {
        return "\nLibro : \nTitulo: " + this.titulo + "\nN.pag : " + this.nPag + "\nPrecio: " + this.precio;
    }

    public void mostrarDatos() {
        System.out.println(this.toString());
    }

    public abstract void calcularPrecio();

}
