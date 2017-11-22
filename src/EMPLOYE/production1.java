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
public class production1 extends production implements prime_risque {

    public production1(String nom, String prenom, String matricule, int age, double date_entre, int unite_produit) {
        super(nom, prenom, matricule, age, date_entre, unite_produit);
    }

   
    @Override
    public double calculer_Salaire(){
        return super.calculer_Salaire() + prime + Salaire_base;
    } 
}
