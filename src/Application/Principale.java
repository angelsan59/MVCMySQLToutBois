package Application;


import View.FenetrePrincipaleFrame;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Appelle la classe FenetrePrincipaleFrame pour l'afficher, et charge les fichiers de données txt
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
public class Principale {
     private static Logger logger = Logger.getLogger(Principale.class);
     
    /**
     * Ouverture de la fenêtre principale de l'application
     * @param args the command line arguments
     * @throws java.io.IOException  erreur si le fichier parent n'existe pas
     */
    public static void main(String[] args) throws IOException {
        
                      
        /**
         * Chargement de la fenetre principale
         */
        logger.debug("msg de debogage");
logger.info("msg d'information");
logger.warn("msg d'avertissement");
logger.error("msg d'erreur");
logger.fatal("msg d'erreur fatale");
        FenetrePrincipaleFrame fp = new FenetrePrincipaleFrame (new javax.swing.JFrame(), true);
        fp.setVisible(true);
     }
}
