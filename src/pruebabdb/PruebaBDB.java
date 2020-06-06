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
        caracteristica2 c2 = new caracteristica2();
        int hora = 10;
        System.out.println("estado: " + c2.state());
        System.out.println("esta abierto? " + (c.abierto(hora) ? "Si":"No"));
    }
    
}
