/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import javax.swing.JOptionPane;

/**
 * Classe modifiant et supprimant les données des tables. Une méthode par table.
 * @author sociepka
 */
public class ModificationBD {
    /**
     * Méthode d'ajout des représentants
     * @param repnom nom du representant
     * @param repprenom prenom du representant
     * @param sal1 salaire
     * @param txc taux de commission
     * @param idrep numéro du représentant
     * @param repactif état du représentant : actif ou non
     */
    public static void modRep(String repactif,int idrep,String repnom,String repprenom,float sal1,float txc)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "UPDATE `representants` SET `actif`='"+repactif+"', `nomrep`='"+repnom+"', `prenomrep` = '"+repprenom+"',"
                      + " `salaire` = '"+sal1+"', `txcommission` = '"+txc+"' WHERE `representants`.`id_rep` = "+idrep+"";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                if (repactif.equals("oui"))
                {JOptionPane.showMessageDialog(null, "Le représentant a bien été modifié", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);}
                else if (repactif.equals("non"))
                {JOptionPane.showMessageDialog(null, "Le représentant a bien été supprimé", "Suppression de représentant", JOptionPane.INFORMATION_MESSAGE);}
                
                // else {JOptionPane.showMessageDialog(null, "Probleme de type", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);}
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
    
    /**
     * Méthode de modification et suppression de client
     * @param clactif état du client : actif ou non
     * @param idcli numéro du client
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
     */
    public static void modCli(String clactif,int idcli,String nomens, String siret, String dateder, String adresse1, String adresse2, 
            String cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "UPDATE `clients` SET `actif`='"+clactif+"', `nomens`='"+nomens+"', `siret` = '"+siret+"',"
                      + " `dateder` = '"+dateder+"', `adresse1` = '"+adresse1+"', `adresse2` = '"+adresse2+"',"
                      + " `cp` = '"+cp+"', `ville` = '"+ville+"', `pays` = '"+pays+"', `nomcont` = '"+nomcont+"',"
                      + " `prenomcont` = '"+prenomcont+"', `telfixe` = '"+telfixe+"', `telport` = '"+telport+"',"
                      + " `email` = '"+email+"' WHERE `clients`.`idcli` = "+idcli+"";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                if (clactif=="oui")
                {JOptionPane.showMessageDialog(null, "Le client a bien été modifié", "Modification de client", JOptionPane.INFORMATION_MESSAGE);}
                 if (clactif=="non")
                {JOptionPane.showMessageDialog(null, "Le client a bien été supprimé", "Suppression de client", JOptionPane.INFORMATION_MESSAGE);}
                 else {JOptionPane.showMessageDialog(null, "Probleme de type", "Modification de client", JOptionPane.INFORMATION_MESSAGE);}
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
    
     /**
     * Méthode de modification et suppression de prospects
     * @param practif état du prospect : actif ou non
     * @param idpro numéro du prospect
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
     */
  public static void modPro(String practif,int idpro,String nomens, String siret, String dateder, String adresse1, String adresse2, 
            String cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "UPDATE `prospects` SET `actif`='"+practif+"', `nomens`='"+nomens+"', `siret` = '"+siret+"',"
                      + " `dateder` = '"+dateder+"', `adresse1` = '"+adresse1+"', `adresse2` = '"+adresse2+"',"
                      + " `cp` = '"+cp+"', `ville` = '"+ville+"', `pays` = '"+pays+"', `nomcont` = '"+nomcont+"',"
                      + " `prenomcont` = '"+prenomcont+"', `telfixe` = '"+telfixe+"', `telport` = '"+telport+"',"
                      + " `email` = '"+email+"' WHERE `prospects`.`idpro` = "+idpro+"";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                if (practif=="oui")
                {JOptionPane.showMessageDialog(null, "Le prospect a bien été modifié", "Modification de prospect", JOptionPane.INFORMATION_MESSAGE);}
                 if (practif=="non")
                {JOptionPane.showMessageDialog(null, "Le prospect a bien été supprimé", "Suppression de prospect", JOptionPane.INFORMATION_MESSAGE);}
                 else {JOptionPane.showMessageDialog(null, "Probleme de type", "Modification de prospect", JOptionPane.INFORMATION_MESSAGE);}
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
