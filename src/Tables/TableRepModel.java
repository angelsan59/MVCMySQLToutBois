/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import interBD.InterrogationBD;
import static interBD.InterrogationBD.getRep;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sociepka
 */
public class TableRepModel {


    public static void TableRepModel(javax.swing.table.DefaultTableModel model) {
         model.fireTableDataChanged();
            Object[] columnsName = new Object[6];
        
        columnsName[0] = "Numéro";
        columnsName[1] = "Actif";
        columnsName[2] = "Nom";
        columnsName[3] = "Prénom";
        columnsName[4] = "Salaire";
        columnsName[5] = "Taux de commission";
         
        
        model.setColumnIdentifiers(columnsName);
      InterrogationBD.getRep();  
      
        Object[] rowData = new Object[6];
        
        for(int i = 0; i < getRep().size(); i++){
            
            //if (getRep().get(i).getActif()=="oui"){
            rowData[0] = getRep().get(i).getId_rep();
            rowData[1] = getRep().get(i).getActif();
            rowData[2] = getRep().get(i).getNomrep();
            rowData[3] = getRep().get(i).getPrenomrep();
            rowData[4] = getRep().get(i).getSalaire();
            rowData[5] = getRep().get(i).getTxcommission();
             
               model.addRow(rowData);
        //}
            
           // else{
            //rowData[0] = getRep().get(i).getId_rep();
           // rowData[1] = getRep().get(i).getNomrep();
           // rowData[2] = getRep().get(i).getPrenomrep();
           // rowData[3] = getRep().get(i).getSalaire();
           // rowData[4] = getRep().get(i).getTxcommission();
           // rowData[5] = getRep().get(i).getActif();
               
            //   model.addRow(rowData);
        //}
    }
   
}}
