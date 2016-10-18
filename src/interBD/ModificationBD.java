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
     * @param sal salaire
     * @param txc taux de commission
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
                if (repactif=="oui")
                {JOptionPane.showMessageDialog(null, "Le représentant a bien été modifié", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);}
                 if (repactif=="non")
                {JOptionPane.showMessageDialog(null, "Le représentant a bien été supprimé", "Suppression de représentant", JOptionPane.INFORMATION_MESSAGE);}
                 else {JOptionPane.showMessageDialog(null, "Probleme de type", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);}
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
    
    public static void modCli(String clactif,int idcli,String nomens, String siret, String dateder, String adresse1, String adresse2, 
            String cp, String ville, String pays, String nomcont, String prenomcont, int telfixe, int telport, 
            String email, int nbcommandes)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "UPDATE `clients` SET `actif`='"+clactif+"', `nomens`='"+nomens+"', `siret` = '"+siret+"',"
                      + " `dateder` = '"+dateder+"', `adresse1` = '"+adresse1+"', `adresse2` = '"+adresse2+"',"
                      + " `cp` = '"+cp+"', `ville` = '"+ville+"', `pays` = '"+pays+"', `nomcont` = '"+nomcont+"',"
                      + " `prenomcont` = '"+prenomcont+"', `telfixe` = '"+telfixe+"', `telport` = '"+telport+"',"
                      + " `email` = '"+email+"' WHERE `representants`.`idcli` = "+idcli+"";
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
    
    
}
