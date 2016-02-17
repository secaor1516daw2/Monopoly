/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBeans;

import java.io.Serializable;
/**
 *
 * @author secaor
 */
public class Dado implements Serializable {
    public int numero = 0; //valor del dado

    public Dado() {
    }

    public int getNumero() {
        randNum();
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void randNum(){
        this.numero = (int) (Math.floor(Math.random()) * 6 + 1);
    }
    
}
