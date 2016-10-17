/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import javax.swing.JOptionPane;

/**
 *
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
    public static void modRep(int idrep,String repnom,String repprenom,int sal,float txc)
    { 
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
            
           try
           {
              String query = "UPDATE `representants` SET `nomrep`='"+repnom+"', `prenomrep` = '"+repprenom+"',"
                      + " `salaire` = '"+sal+"', `txcommission` = '"+txc+"' WHERE `representants`.`id_rep` = "+idrep+"";
          int rs1 = conn.exup(query);
            if (rs1 != 0) {
                
                JOptionPane.showMessageDialog(null, "Le représentant a bien été modifiéé", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);
                
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
