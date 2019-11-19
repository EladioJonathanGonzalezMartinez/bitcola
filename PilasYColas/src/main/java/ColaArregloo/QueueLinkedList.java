/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaArregloo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author remix
 */
public class QueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue = new LinkedList();
        queue.add("Adrian");
        queue.add("Jesus");
        queue.add("Daniel");
        queue.add("Eladio");
        //Elimina
        queue.remove();
        //Muesta el primero
        System.out.println(queue.remove());
        queue.element();
        System.out.println(queue.element());
        //eliminar un elemento de la estructura
        queue.peek();
        
        System.out.println(queue.toString());
    }
    
}
