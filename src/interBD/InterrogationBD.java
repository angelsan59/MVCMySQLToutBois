/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interBD;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.*;

/**
 * Récupération des données des tables representants, clients et prospects.
 * Construction d'ArrayLists, à l'aide des constructeurs et des getteurs
 * @author sociepka
 */
public class InterrogationBD {  

 /**
  * Méthode pour la récupération des données de la table representants
  * @return les données
  */ 
   public static ArrayList<Representant> getRep() 
    { 
      ArrayList<Representant> r = new ArrayList<>();
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
                try {
                    ResultSet rs = conn.exec("select * from representants where actif='oui'");
                        if (rs != null) {
                            while (rs.next()) {
                                Representant rep = new Representant(
                                rs.getInt("id_rep"),
                                rs.getString("actif"),
                                rs.getString("nomrep"),
                                rs.getString("prenomrep"),
                                rs.getInt("salaire"),
                                rs.getFloat("txcommission"));
                                r.add(rep);
                            }
                            rs.next();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
             } 
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
           return r;    
    }
   
   /**
  * Méthode pour la récupération des données de la table clients
  * @return les données
  */ 
      public static ArrayList<Client> getCli() 
    { 
      ArrayList<Client> r = new ArrayList<>();
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
                try {
                    ResultSet rs = conn.exec("select * from clients where actif='oui'");
                        if (rs != null) {
                            while (rs.next()) {
                                Client cli = new Client(
                                rs.getInt("idcli"),
                                rs.getString("actif"),
                                rs.getString("nomens"),
                                rs.getString("siret"),
                                rs.getString("dateder"),
                                rs.getString("adresse1"),        
                                rs.getString("adresse2"),
                                rs.getString("cp"),
                                rs.getString("ville"),
                                rs.getString("pays"),
                                rs.getString("nomcont"),
                                rs.getString("prenomcont"),
                                rs.getInt("telfixe"),
                                rs.getInt("telport"),
                                rs.getString("email"),
                                rs.getInt("nbcommandes")
                             ); 
                                r.add(cli);
                            }
                            rs.next();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
             } 
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
           return r;     
    }
      
  /**
  * Méthode pour la récupération des données de la table prospects
  * @return les données
  */ 
      public static ArrayList<Prospect> getPro() 
    { 
      ArrayList<Prospect> r = new ArrayList<>();
    ConnectionBD conn = new ConnectionBD("jdbc:mysql://localhost:3306/toutbois", "root", "");
    
        if (conn.connect()) {
                try {
                    ResultSet rs = conn.exec("select * from prospects where actif='oui'");
                        if (rs != null) {
                            while (rs.next()) {
                                Prospect pro = new Prospect(
                                rs.getInt("idpro"),
                                rs.getString("actif"),
                                rs.getString("nomens"),
                                rs.getString("siret"),
                                rs.getString("dateder"),
                                rs.getString("adresse1"),        
                                rs.getString("adresse2"),
                                rs.getString("cp"),
                                rs.getString("ville"),
                                rs.getString("pays"),
                                rs.getString("nomcont"),
                                rs.getString("prenomcont"),
                                rs.getInt("telfixe"),
                                rs.getInt("telport"),
                                rs.getString("email")
                             );
                                r.add(pro);
                            }
                            rs.next();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
             } 
    else {
            System.out.println("mysql connection failed !!!");
        }
             conn.close();
           return r;
    }  
    }     