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
public class personnel {
     private Employe[] collection;
    private int nbreEmploye; // nombre des employés de l'entreprise
    private final static int nbremaxemploye=70;//nombre maximal d'employés que peut comtenir l'entreprise 
    
    public personnel(){
        //mon tableau est appelé colection.
        
        collection= new Employe[nbremaxemploye];
        nbreEmploye=0;
    }
    
    public void ajouterEmploye(Employe e){
        
        ++nbreEmploye;
        
         if(nbreEmploye<=nbremaxemploye)
        {
            collection[nbreEmploye-1]=e;
        } 
        else 
            System.out.println("pas plus de "+nbremaxemploye+" employés ");
        
    }
    
    public double Salaire_moyen(){
        double som=0.0;
        
        for(int i=0;i<nbreEmploye;i++){
            som += collection[i].calculer_Salaire();
        }
        
        return som/nbreEmploye;
    }
    
    public void afficherSalaire(){
        
        for(int i=0; i<nbreEmploye; i++){
            System.out.println(collection[i].getNom()+" gagne "+collection[i].calculer_Salaire()+ "FCFA");
        
        }
}
}