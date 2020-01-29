package practicaherencia21;

import libreria.Libro;
import libreria.LibroInfantil;
import libreria.adultos.Novela;

/**
 *
 * @author PC-03
 */
public class PracticaHerencia21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("El Éxito",200,30.5) {
            @Override
            public void calcularPrecio() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        libro.mostrarDatos();
        //String datos = libro.toString();
        //System.out.println(datos);
        
        LibroInfantil lin=new LibroInfantil("Amigo se escribe con H",70,25.7,10);
        //System.out.println(lin.toString());
        lin.mostrarDatos();
        
        Novela nov=new Novela("La Rosa exótica",150,36.20,18);
        //System.out.println(nov.toString());
        nov.mostrarDatos();
      
    }

}
