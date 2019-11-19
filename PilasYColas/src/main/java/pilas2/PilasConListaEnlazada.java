/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas2;

/**
 *
 * @author remix
 */
public class PilasConListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilas pila = new Pilas();
        persona adrian = new persona();
        adrian.setNombre("Adrian");
        adrian.setEdad(20);
        adrian.setDireccion("Av. Universidad #100 col. El Carmen");
        pila.insertar(adrian);
        
        
        adrian.setNombre("Alan");
        adrian.setEdad(19);
        adrian.setDireccion("Tepeji del rio, col. El paraiso");
        pila.insertar(adrian);
        
        adrian.setNombre("Ernesto");
        adrian.setEdad(19);
        adrian.setDireccion("Tula de Allende col. El Llano");
        pila.insertar(adrian);
        
        adrian.setNombre("Janeth");
        adrian.setEdad(20);
        adrian.setDireccion("Coyotepec");
        pila.insertar(adrian);
        
        
    }
    
}
