/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.* ;


/**
 *
 * @author scoulon
 */
public class ControlesDesChamps  {
    
    public boolean sidatebonne(String dateaverifier) throws ParseException {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // vérifie si conforme au calendrier Grégorien
        simpleDateFormat.setLenient(false);
        String date1 = dateaverifier;
        try {
            date = simpleDateFormat.parse(date1);
            //System.out.println(date);
            //date = simpleDateFormat.parse(date2);
            //System.out.println(date);
            } 
        catch (ParseException e) 
            {
           // System.out.println("La date est fausse : "+ date);    
            return false ;
            }
    return true ;
    // Fermeture de la fonction sidatebonne
    } 
    
    public boolean siemaibon(String mailaverifier) throws PatternSyntaxException {
        try {
            // Verification de l'email
            // qqc.qqc@qqc.qqc, moi@coucou.com ==> Ok
            // moicoucou.com, moi@coucou ==> nok;
            return Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", mailaverifier.toLowerCase() ) ;
            }
        catch(PatternSyntaxException pse)
        {
            return false ;
        }
    }

    public boolean sitelportbon(String telportaverifier, String pays) throws PatternSyntaxException {
        try {
            if (pays.equals("France")) {
                return Pattern.matches("^(0|(00|\\+)33)[67][0-9]{8}$", telportaverifier ) ;
            }
            else
            {
                return Pattern.matches("^[0-9]{10}$", telportaverifier) ;
            }    
            }
        catch(PatternSyntaxException pse)
        {
            return false ;
        }
    }    
   
    public boolean sitelfixebon(String telfixeaverifier, String pays) throws PatternSyntaxException {
        try {

            if (pays.equals("France")) {
                return Pattern.matches("^(0|(00|\\+)33)[0-9]{9}$", telfixeaverifier ) ;
            }
            else
            {
                return Pattern.matches("^[0-9]{10}$", telfixeaverifier  ) ;
            }    
            // return true ;
            }
        catch(PatternSyntaxException pse)
        {
            return false ;
        }
    }
    
    public boolean sichampstxtbon (String txtaverifier) {
        return true ;
    }
    
       
    public boolean sisiretbon(String siret, String pays) throws PatternSyntaxException {
         // numéro SIRET
         // Le numéro d'identité d'établissement est articulé en deux parties : la première est le n° SIREN de la
         // personne à laquelle appartient l'unité SIRET ; la seconde est un numéro d'ordre à 4 chiffres attribué à
         // l'établissement suivi d'un chiffre de contrôle, qui permet de vérifier la validité de l'ensemble du numéro
         // SIRET. Cette seconde partie est habituellement appelée NIC (numéro interne de classement).
         // Méthode de vérification :
         // Un SIRET est le résultat de la concaténation d'un numéro SIREN à 9 chiffres (dont la clé doit être
         // vérifiée à part) et d'un numéro interne de classement (NIC) complété éventuellement à gauche par des
        // zéros de façon que sa longueur soit de 4 chiffres. Le dernier et 14ème chiffre est une clé (1-2) qui
        // porte sur les 13 premiers chiffres.
        // On multiplie les chiffres de rang impair à partir de la droite par 1, ceux de rang pair par 2 ; la somme
        // des chiffres obtenus est un multiple de 10.
        // Exemple :
        // pour vérifier :   7 3 2 8 2 9 3 2 0 0 0 0 7 4
        // rang pair x 2 :  14   4   4   6   0   0  14
        // rang impair x 1 :   3   8   9   2   0   0   4
        // -----------------------------------
        // somme : 1+4+3+4+8+4+9+6+2+0+0+0+0+1+4+4=50
        // Le numéro est exact. Il correspond au SIRET du 7ème établissement immatriculé par l'entreprise.
        try {     
            if (pays.equals("France")) {
                // Partie en cours de conception.
                return true ;
            }
            else
            {
                // Pas de contrôle siret sur les pays étrangers donc return => Ok.
                return true ;
            }    
            // return true ;
            }
        catch(PatternSyntaxException pse)
        {
            return false ;
        }
    }


// Fermeture de la classe ChampsDivers
}  