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
            Object[] columnsName = new Object[8];
        
        columnsName[0] = "Numéro";
        columnsName[1] = "Nom de l'enseigne";
        columnsName[2] = "dernière visite";
        columnsName[3] = "Adresse";
        columnsName[4] = "Code Postal";
        columnsName[5] = "Ville";
        columnsName[6] = "Pays";
        columnsName[7] = "Nb Commandes";
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getCli();  
      
        Object[] rowData = new Object[8];
        
        for(int i = 0; i < getCli().size(); i++){
            
            rowData[0] = getCli().get(i).getIdcli();
            rowData[1] = getCli().get(i).getNomens();
            rowData[2] = getCli().get(i).getDateder();
            rowData[3] = getCli().get(i).getAdresse1();
            rowData[4] = getCli().get(i).getCp();
            rowData[4] = getCli().get(i).getVille();
            rowData[4] = getCli().get(i).getPays();
            rowData[4] = getCli().get(i).getNbcommandes();
               
               model.addRow(rowData);
        }
    }
    
 /**
 * Méthode pour remplir la table des clients et la mettre à jour si besoin
 * @param model le modèle utilisé pour la table
 */
    public static void TableProModel(javax.swing.table.DefaultTableModel model) {
         model.fireTableDataChanged();
            Object[] columnsName = new Object[7];
        
        columnsName[0] = "Numéro";
        columnsName[1] = "Nom de l'enseigne";
        columnsName[2] = "dernière visite";
        columnsName[3] = "Adresse";
        columnsName[4] = "Code Postal";
        columnsName[5] = "Ville";
        columnsName[6] = "Pays";
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getPro();  
      
        Object[] rowData = new Object[7];
        
        for(int i = 0; i < getPro().size(); i++){
            
            rowData[0] = getPro().get(i).getIdpro();
            rowData[1] = getPro().get(i).getNomens();
            rowData[2] = getPro().get(i).getDateder();
            rowData[3] = getPro().get(i).getAdresse1();
            rowData[4] = getPro().get(i).getCp();
            rowData[4] = getPro().get(i).getVille();
            rowData[4] = getPro().get(i).getPays();
               
               model.addRow(rowData);
        }
    }
}
