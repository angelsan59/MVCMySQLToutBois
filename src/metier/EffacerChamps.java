/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import javax.swing.*;
/**
 * Classe permettant d'effacer les données des champs de formulaires  
 * @author sociepka
 */
public class EffacerChamps {
     public static void effacerchampsclipro (JTable nomtable, JTextField chpNomenseigne,
             JTextField chpSiret, JTextField chpDatevisite, JTextField chpAdresse1,JTextField chpAdresse2,JTextField chpCodepostal,JTextField chpVille,
             JTextField chpNom,JTextField chpPrenom,JTextField chpEmail,JTextField chpTelportable,
             JTextField chpTelfixe,JLabel lbid,JComboBox<String>comboPays) {
               
        chpNomenseigne.setText ("") ;
        chpSiret.setText ("") ;
        chpDatevisite.setText ("") ;
        chpAdresse1.setText ("") ;
        chpAdresse2.setText ("") ;
        chpCodepostal.setText ("") ;
        chpVille.setText ("") ;
        chpNom.setText ("") ;
        chpPrenom.setText ("") ;
        chpEmail.setText ("") ;
        chpTelportable.setText ("") ;
        chpTelfixe.setText ("") ;
        lbid.setText ("") ;
        comboPays.setSelectedIndex(0);
        nomtable.getSelectionModel().clearSelection();
    }
}
