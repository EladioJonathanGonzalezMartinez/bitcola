/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaArregloo;

/**
 *
 * @author remix
 */
class Nodo {
    Object elemento;
    Nodo Siguiente;
    
    public Nodo(Object x){
        elemento = x;
        Siguiente = null;
    }
}
public class QueueArreglo {

    protected Nodo frente;
    protected Nodo fin;

    public QueueArreglo() {
        frente = fin = null;
    }

    public void insertar(int elemento) {
        Nodo a;
        a = new Nodo(elemento);
        if (esVacia()) {
            frente = a;
        }
        else {
            fin.Siguiente = a;
        }
        fin = a;
    }
    
    public Object quitar() throws Exception{
        Object aux;
        if (!esVacia()) {
            aux = frente.elemento;
            frente = frente.Siguiente;
        }
        else {
            throw new Exception("Eliminar de una cola vacia");
        }
        return aux;
    }
    
    public void BorrarCola(){
        for (;frente != null;) {
            frente = frente.Siguiente;
        }
        System.gc();
    }
    
    public Object frenteCola() throws Exception {
        if (esVacia()) {
            throw new Exception("Error: Cola vacia");
        }
        return (frente == null);
        
    }
    
    private boolean esVacia() {
        return (frente == null);
    }

}
