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
public class commerciale extends Employe  {
    private double Pourcentage= 0.2;
    private final static int Bonus_vendeur= 200;
public double chiffre_affaire;
    public commerciale(String nom, String prenom, String matricule, int age, double date_entre) {
        super(nom, prenom, matricule, age, date_entre);
    }

    @Override
    public double calculer_Salaire() {
         return (Pourcentage*chiffre_affaire + Bonus_vendeur + Salaire_base);
    
    }
}
