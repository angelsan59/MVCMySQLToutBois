/*
 * Classe de formattage et remplissage des tables des différentes fenêtres
 */
package metier;

import interBD.*;
import static interBD.InterrogationBD.getCli;
import static interBD.InterrogationBD.getPro;
import static interBD.InterrogationBD.getRep;

/**
 *
 * @author sociepka
 */
public class TableTousModel {

/**
 * Méthode pour remplir la table des représentants et la mettre à jour si besoin
 * @param model le modèle utilisé pour la table
 */
    public static void TableRepModel(javax.swing.table.DefaultTableModel model) {
         model.fireTableDataChanged();
            Object[] columnsName = new Object[5];
        
        columnsName[0] = "Numéro";
        columnsName[1] = "Nom";
        columnsName[2] = "Prénom";
        columnsName[3] = "Salaire";
        columnsName[4] = "Taux de commission";
         
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getRep();  
      
        Object[] rowData = new Object[5];
        
        for(int i = 0; i < getRep().size(); i++){
           
                System.out.println("test table 2 "+getRep().get(i).getActif());
            rowData[0] = getRep().get(i).getId_rep();
            rowData[1] = getRep().get(i).getNomrep();
            rowData[2] = getRep().get(i).getPrenomrep();
            rowData[3] = getRep().get(i).getSalaire();
            rowData[4] = getRep().get(i).getTxcommission();
             
               model.addRow(rowData);
}
   
}
    
    /**
 * Méthode pour remplir la table des clients et la mettre à jour si besoin
 * @param model le modèle utilisé pour la table
 */
    public static void TableCliModel(javax.swing.table.DefaultTableModel model) {
         model.fireTableDataChanged();
            Object[] columnsName = new Object[15];
        
        columnsName[0] = "Numéro";
        columnsName[1] = "Nom de l'enseigne";
        columnsName[2]= "Siret";
        columnsName[3] = "dernière visite";
        columnsName[4] = "Adresse";
        columnsName[5] = "Adresse";
        columnsName[6] = "Code Postal";
        columnsName[7] = "Ville";
        columnsName[8] = "Pays";
        columnsName[9] = "Nom Contact";
        columnsName[10] = "Prenom Contact";
        columnsName[11] = "telephone fixe";
        columnsName[12] = "telephone portable";
        columnsName[13] = "email";
        
        columnsName[14] = "Nb Commandes";
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getCli();  
      
        Object[] rowData = new Object[15];
        
        for(int i = 0; i < getCli().size(); i++){
            
            rowData[0] = getCli().get(i).getIdcli();
            rowData[1] = getCli().get(i).getNomens();
            rowData[2] = getCli().get(i).getSiret();
            rowData[3] = getCli().get(i).getDateder();
            rowData[4] = getCli().get(i).getAdresse1();
            rowData[5] = getCli().get(i).getAdresse2();
            rowData[6] = getCli().get(i).getCp();
            rowData[7] = getCli().get(i).getVille();
            rowData[8] = getCli().get(i).getPays();
            rowData[9] = getCli().get(i).getNomcont();
            rowData[10] = getCli().get(i).getPrenomcont();
            rowData[11] = getCli().get(i).getTelfixe();
            rowData[12] = getCli().get(i).getTelport();
            rowData[13] = getCli().get(i).getEmail();
            rowData[14] = getCli().get(i).getNbcommandes();
               
               model.addRow(rowData);
        }
    }
    
 /**
 * Méthode pour remplir la table des clients et la mettre à jour si besoin
 * @param model le modèle utilisé pour la table
 */
    public static void TableProModel(javax.swing.table.DefaultTableModel model) {
         model.fireTableDataChanged();
            Object[] columnsName = new Object[14];
        
         columnsName[0] = "Numéro";
        columnsName[1] = "Nom de l'enseigne";
        columnsName[2]= "Siret";
        columnsName[3] = "dernière visite";
        columnsName[4] = "Adresse";
        columnsName[5] = "Adresse";
        columnsName[6] = "Code Postal";
        columnsName[7] = "Ville";
        columnsName[8] = "Pays";
        columnsName[9] = "Nom Contact";
        columnsName[10] = "Prenom Contact";
        columnsName[11] = "telephone fixe";
        columnsName[12] = "telephone portable";
        columnsName[13] = "email";
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getPro();  
      
        Object[] rowData = new Object[14];
        
        for(int i = 0; i < getPro().size(); i++){
            
            rowData[0] = getPro().get(i).getIdpro();
            rowData[1] = getPro().get(i).getNomens();
            rowData[2] = getPro().get(i).getSiret();
            rowData[3] = getPro().get(i).getDateder();
            rowData[4] = getPro().get(i).getAdresse1();
            rowData[5] = getPro().get(i).getAdresse2();
            rowData[6] = getPro().get(i).getCp();
            rowData[7] = getPro().get(i).getVille();
            rowData[8] = getPro().get(i).getPays();
            rowData[9] = getPro().get(i).getNomcont();
            rowData[10] = getPro().get(i).getPrenomcont();
            rowData[11] = getPro().get(i).getTelfixe();
            rowData[12] = getPro().get(i).getTelport();
            rowData[13] = getPro().get(i).getEmail();
               
               model.addRow(rowData);
        }
    }
}
