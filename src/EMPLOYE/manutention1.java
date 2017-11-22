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
public class manutention1 extends manutention implements prime_risque {

    public manutention1(String nom, String prenom, String matricule, int age, double date_entre, int heures) {
        super(nom, prenom, matricule, age, date_entre, heures);
    }
     
    @Override
    public double calculer_Salaire(){
        return super.calculer_Salaire() + prime + Salaire_base + prime;
    }
}
