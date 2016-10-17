/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author sociepka
 */
public class Representant {
    int id_rep;
    String actif;
    String nomrep;
    String prenomrep;
    float salaire;
    float txcommission;

    public Representant() {
    }

    public Representant(int id_rep, String actif, String nomrep, String prenomrep, float salaire, float txcommission) {
        this.id_rep = id_rep;
        this.actif = actif;
        this.nomrep = nomrep;
        this.prenomrep = prenomrep;
        this.salaire = salaire;
        this.txcommission = txcommission;
    }

    public int getId_rep() {
        return id_rep;
    }

    public void setId_rep(int id_rep) {
        this.id_rep = id_rep;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public String getNomrep() {
        return nomrep;
    }

    public void setNomrep(String nomrep) {
        this.nomrep = nomrep;
    }

    public String getPrenomrep() {
        return prenomrep;
    }

    public void setPrenomrep(String prenomrep) {
        this.prenomrep = prenomrep;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public float getTxcommission() {
        return txcommission;
    }

    public void setTxcommission(float txcommission) {
        this.txcommission = txcommission;
    }
    
    
}
