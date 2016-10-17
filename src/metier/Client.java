/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;

/**
 *
 * @author sociepka
 */
public class Client {
    int idcli;
    String actif;
    String nomens;
    int siret;
    Date dateder;
    String adresse1;
    String adresse2;
    int cp;
    String ville;
    String pays;
    String nomcont;
    String prenomcont;
    int telfixe;
    int telport;
    String email;
    int nbcommandes;

    public Client() {
    }

    public Client(int idcli, String actif, String nomens, int siret, Date dateder, 
            String adresse1, String adresse2, int cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email, int nbcommandes) {
        this.idcli = idcli;
        this.actif = actif;
        this.nomens = nomens;
        this.siret = siret;
        this.dateder = dateder;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.nomcont = nomcont;
        this.prenomcont = prenomcont;
        this.telfixe = telfixe;
        this.telport = telport;
        this.email = email;
        this.nbcommandes = nbcommandes;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public String getNomens() {
        return nomens;
    }

    public void setNomens(String nomens) {
        this.nomens = nomens;
    }

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public Date getDateder() {
        return dateder;
    }

    public void setDateder(Date dateder) {
        this.dateder = dateder;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNomcont() {
        return nomcont;
    }

    public void setNomcont(String nomcont) {
        this.nomcont = nomcont;
    }

    public String getPrenomcont() {
        return prenomcont;
    }

    public void setPrenomcont(String prenomcont) {
        this.prenomcont = prenomcont;
    }

    public int getTelfixe() {
        return telfixe;
    }

    public void setTelfixe(int telfixe) {
        this.telfixe = telfixe;
    }

    public int getTelport() {
        return telport;
    }

    public void setTelport(int telport) {
        this.telport = telport;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNbcommandes() {
        return nbcommandes;
    }

    public void setNbcommandes(int nbcommandes) {
        this.nbcommandes = nbcommandes;
    }
    
    
}
