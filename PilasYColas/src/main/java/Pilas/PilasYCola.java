/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author remix
 */
public class PilasYCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pila[] = new int[10];
        Pilas objPilaEnteros = new Pilas(pila);
        int opcion = 0;
//        //Agregamos (operacion push) elementos a la pila de datos
//        //el dondo de la pila seria 90 y la sima 12
        objPilaEnteros.insertar(90);
        objPilaEnteros.insertar(56);
        objPilaEnteros.insertar(23);
        objPilaEnteros.insertar(12);
//        
//        //mostramos los elementos dentro de la pila
//        objPilaEnteros.mostrarPila();
//        
//        //traer fondo
//        objPilaEnteros.fondo();
//        //traer cima
//        objPilaEnteros.cima();
//        //eliminamos la cima de la pila
//        objPilaEnteros.retirar();
//        
//        //mostramos nuevamente la pila para comprobar que se elimino
//        objPilaEnteros.mostrarPila();
        String res= JOptionPane.showInputDialog("¿Desea iniciar una pila? si/no");
        if(res.equalsIgnoreCase("si")){
            do{
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige la operación que deseas realizar \n1) Insertar \n2) Retirar \n"
        + "3)Mostrar pila \n4) Cimas \n5) Fondos \n6) Salir"));
                switch(opcion){
                        case 1:
                            int dato=Integer.parseInt(JOptionPane.showInputDialog("Escribe el dato que deseas insertar"));
                            objPilaEnteros.insertar(dato);
                            break;
                        case 2:
                            objPilaEnteros.retirar();
                            break;
                        case 3:
                            objPilaEnteros.mostrarPila();
                            break;
                        case 4:
                            objPilaEnteros.cima();
                        case 5:
                            objPilaEnteros.fondo();
                            break;
                        case 6:
                            System.exit(0);
} }while(res != String.valueOf(6));     
    } else{
            System.exit(0);
        }




} 
}
