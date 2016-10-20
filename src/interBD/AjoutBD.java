/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Classe qui ajoute les représentants, clients et prospects créés dans le formulaire
 * @author sociepka
 */
public class AjoutBD {
    
    /**
     * Méthode d'ajout des représentants
     * @param repnom nom du representant
     * @param repprenom prenom du representant
     * @param sal salaire
     * @param txc taux de commission
     * @param repactif état du représentant : actif ou non
     */
    public static void addRep(String repactif,String repnom,String repprenom,int sal,float txc)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
           try
           {
              String query = "INSERT INTO representants (`id_rep`, `actif`, `nomrep`, `prenomrep`, `salaire`, `txcommission`) VALUES (NULL, '"+repactif+"', '"+repnom+"', '"+repprenom+"', '"+sal+"', '"+txc+"')";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                JOptionPane.showMessageDialog(null, "Le représentant a bien été ajouté", "Ajout de représentant", JOptionPane.INFORMATION_MESSAGE); }
            } catch (Exception d) 
                        { 
                            System.out.println ("Probleme de requete à insersion representant"); 
                        } 
        }
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
    }

 /**
  * Méthode d'ajout de clients
  * @param nomens nom de l'enseigne
  * @param siret numéro de SIRET
  * @param dateder date de dernière visite
  * @param adresse1 première ligne d'adresse
  * @param adresse2 complément d'adresse
  * @param cp code postal
  * @param ville ville
  * @param pays pays
  * @param nomcont nom du contact
  * @param prenomcont prénom du contact
  * @param telfixe numéro de téléphone fixe
  * @param telport numéro de téléphone portable
  * @param email adresse email
  * @param nbcommandes nombre de commandes passées par le client
  * @param clactif état du client : actif ou non
  */
    public static void addCli(String clactif,String nomens, String siret, String dateder, String adresse1, String adresse2, 
            String cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email, int nbcommandes)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
           try
           {
              String query = "INSERT INTO clients (`idcli`, `actif`, `nomens`, `siret`, `dateder`, `adresse1`, "
                      + "`adresse2`, `cp`, `ville`, `pays`, `nomcont`, `prenomcont`, `telfixe`, `telport`, `email`, `nbcommandes`"
                      + ") VALUES (NULL, '"+clactif+"', '"+nomens+"', '"+siret+"', STR_TO_DATE('"+dateder+"','%e/%c/%Y'), '"+adresse1+"', '"+adresse2+"', '"+cp+"',"
                      + " '"+ville+"', '"+pays+"', '"+nomcont+"', '"+prenomcont+"', '"+telfixe+"', '"+telport+"', '"+email+"', '"+nbcommandes+"')";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                JOptionPane.showMessageDialog(null, "Le client a bien été ajouté", "Ajout de client", JOptionPane.INFORMATION_MESSAGE);}
} catch (Exception d) 
                        { 
                            System.out.println ("Probleme de requete"); 
                        } 
        }
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
    }
    
    /**
  * Méthode d'ajout de prospects
  * @param nomens nom de l'enseigne
  * @param siret numéro de SIRET
  * @param dateder date de dernière visite
  * @param adresse1 première ligne d'adresse
  * @param adresse2 complément d'adresse
  * @param cp code postal
  * @param ville ville
  * @param pays pays
  * @param nomcont nom du contact
  * @param prenomcont prénom du contact
  * @param telfixe numéro de téléphone fixe
  * @param telport numéro de téléphone portable
  * @param email adresse email
  * @param practif état du prospect : actif ou non
  */
    public static void addPro(String practif,String nomens, String siret, String dateder, String adresse1, String adresse2, 
            String cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "INSERT INTO prospects (`idpro`, `actif`, `nomens`, `siret`, `dateder`, `adresse1`, "
                      + "`adresse2`, `cp`, `ville`, `pays`, `nomcont`, `prenomcont`, `telfixe`, `telport`, `email`"
                      + ") VALUES (NULL, '"+practif+"', '"+nomens+"', '"+siret+"', STR_TO_DATE('"+dateder+"','%e/%c/%Y'), '"+adresse1+"', '"+adresse2+"', '"+cp+"',"
                      + " '"+ville+"', '"+pays+"', '"+nomcont+"', '"+prenomcont+"', '"+telfixe+"', '"+telport+"', '"+email+"')";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                
                JOptionPane.showMessageDialog(null, "Le prospect a bien été ajouté", "Ajout de prospect", JOptionPane.INFORMATION_MESSAGE);
                
            }
 
            } catch (Exception d) 
                        { 
                            System.out.println ("Probleme de requete"); 
                        } 
        }
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
    }


}
