/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche bmw =new Coche("1234 AAA",10,16);
        Garaxe pintorColmeiro = new Garaxe();
        pintorColmeiro.entrarGaraxe(bmw);
        pintorColmeiro.sairGaraxe(bmw);
    }
    
}
