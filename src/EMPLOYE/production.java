/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EMPLOYE;

/**
 *
 * @author salihou
 */
public class production extends Employe {
     private final static int unite= 5;
    private int unite_protuit;

    public production(String nom, String prenom, String matricule, int age, double date_entre,int unite_produit) {
        super(nom, prenom, matricule, age, date_entre);
        this.unite_protuit=unite_produit;
    }
      
public double calculer_Salaire(){
       return (unite * unite_protuit) + Salaire_base; 
    }
    
}
