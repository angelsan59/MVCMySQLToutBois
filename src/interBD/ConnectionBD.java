/*
 * classe de connection à la base de données
 */
package interBD;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de connection, déconnection à la base de donnée et création de la requete
 * @author Sandrine Ociepka et Stéphane Coulon
 * version Octobre 2016
 */
public class ConnectionBD {
  
  private String dbURL = "";
    private String user = "";
    private String password = "";
    private java.sql.Connection dbConnect = null;
    private java.sql.Statement dbStatement = null;
 
    /**
     * Constructeur pour la connection à la base de données avec les données de connection
     * @param url adresse de la base
     * @param user nom du user
     * @param password le mot de passe
     */
    public ConnectionBD(String url, String user, String password) {
        this.dbURL = url;
        this.user = user;
        this.password = password;
    }
 
    /**
     * Connecter à la base de données
     * @return false en cas d'échec
     */
    public Boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.dbConnect = DriverManager.getConnection(this.dbURL, this.user, this.password);
            this.dbStatement = this.dbConnect.createStatement();
           // System.out.println("bd connectée");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("oracle connection failed !!!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    /**
     * Executer une requete SQL
     * @param sql la requete
     * @return resultat de la requete
     */
    public ResultSet exec(String sql) {
        try {
            ResultSet rs = this.dbStatement.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("mysql pourri !!!");
        }
        return null;
    }
    
     /**
     * Executer une mise à jour SQL
     * @param sql la requete
     * @return resultat de la requete
     */
    public int exup(String sql) {
        try {
            int rs1 = this.dbStatement.executeUpdate(sql);
            return rs1;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("mysql pourri !!!");
        }
        return 0;
    }
 
    /**
     * Fermer la connexion au serveur de DB
     */
    public void close() {
        try {
            this.dbStatement.close();
            this.dbConnect.close();
            this.dbConnect.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}