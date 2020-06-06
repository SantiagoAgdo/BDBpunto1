/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabdb;

/**
 *
 * @author agudelo
 */
public class PruebaBDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        revision rv = new revision();
        caracteristica1 c1 = new caracteristica1("BDB",26);
        
        rv.revisionCheck(); 
        System.out.println("Hola " + c1.getBanco() + " sede: " + c1.getSede());
    }


    
}
