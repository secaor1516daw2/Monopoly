package javaBeans;

import java.io.Serializable;

/**
 * es un javabean que respresenta una persona
 *
 * @author sergi
 */
public class Persona implements Serializable {

    private String nom;

    public Persona() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + '}';
    }
    
}
