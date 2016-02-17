package javaBeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author secaor
 */
public class Jugador {
 int id; //numero de jugador
 String nom; //nombre de jugador
 int casilla = 0; //casilla inicial en la que se encuentra 

     public Jugador() {

    }
    public Jugador(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
 
 
}
