/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JOptionPane;
import Ventanas.*; 
import java.awt.Component;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Otros {

    private Component rootPane;
    
    //Validar caracteres
    public void VCaracteres(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar() >= 33 && evento.getKeyChar() <= 47
                || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208 || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240 || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 8482){
            evento.consume();
            JOptionPane.showMessageDialog(rootPane, "No esta permitido este caracter especial:   " + evento.getKeyChar());
        }     
    }
    
    public void VCorreo(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar() >= 32 && evento.getKeyChar() <= 45 || evento.getKeyChar() == 47  || evento.getKeyChar() >= 58 && evento.getKeyChar() <= 63 || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96 || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 208 || evento.getKeyChar() >= 210 && evento.getKeyChar() <= 240 || evento.getKeyChar() >= 242 && evento.getKeyChar() <= 8482){
            evento.consume();
            JOptionPane.showMessageDialog(rootPane, "No esta permitido este caracter especial:   " + evento.getKeyChar());
        }
    }
    
    
}
