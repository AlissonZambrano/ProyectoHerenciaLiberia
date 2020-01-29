package libreria;

/**
 *
 * @author PC-03
 */
public class LibroInfantil extends Libro{
    private int numFig;

    //Constructor
    public LibroInfantil(){
        
    }
    public LibroInfantil(int numFig){
        this.numFig=numFig;
    }
    public LibroInfantil(String tit, int nPag, double precio, int nF){
        super(tit,nPag,precio);//llamamos al constructor parametrizado de la clase padre
        this.numFig=nF;
    }
    @Override
    public String toString(){
        //return "Libro: \nTitulo: " + this.titulo + "\nN.pag : " + this.nPag + "\nPrecio: " + this.precio +"\nnFig  : "+this.numFig;
        //no hay que repetir lo que ya esta en la clase Libro
        return super.toString()+"\nnFig  : "+this.numFig;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("\nLibro Infantil: "+this.toString());
    }

    @Override
    public void calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
