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
public class Pilas {
    
    class Nodo{
        Object elemento;
        Nodo siguiente;
        
        public Nodo(Object elemento){
            this.elemento = elemento;
            this.siguiente = null;
        }
    }
        Nodo fin;
        int tamaño;
    
        
        public Pilas() {
            fin = null;
            tamaño = 0;
        }
        
        public Object insertar(Object elemento){
            Nodo nuevo = new Nodo(elemento);
            if (fin == null) {
                fin = nuevo;
            }
            else{
                nuevo.siguiente = fin;
                fin = nuevo;
            }
            return tamaño++;
        }
        
        public Object quitar(){
            if (fin == null) {
                return null;
            } else {
                Object o = fin.elemento;
                fin = fin.siguiente;
                tamaño--;
                return o;
            }
            }
        public boolean esVacia(){
                return (tamaño == 0);
        }
        public int tamaño(){
            return tamaño;
        }
        public Object cima(){
            if (fin == null) {
                return null;
            } else {
                return fin.elemento;
            }
        }
        
    }

