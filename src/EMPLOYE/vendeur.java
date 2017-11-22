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
public class vendeur extends commerciale {
    private static final double Pourcentage= 0.2;
    private final static int Bonus_vendeur= 100;

    public vendeur(String nom, String prenom, String matricule, int age, double date_entre) {
        super(nom, prenom, matricule, age, date_entre);
    }
    

 public double Calculer_salaire(){
        return (Pourcentage* chiffre_affaire + Bonus_vendeur + Salaire_base);       
    }                              
}
