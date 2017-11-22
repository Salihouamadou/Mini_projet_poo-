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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
  personnel p1 = new personnel();
p1.ajouterEmploye(new manutention1("tussain","daniel","15dd66",12,2017,500));
p1.ajouterEmploye(new manutention("david","ali","sss42100",12,2015,2500));
p1.ajouterEmploye(new production("vaidang","junior","17b56dd",45,2017,5000));
p1.ajouterEmploye(new production1("ousmanou sadou","fodouer","11a412fs",40,2101,400));
p1.ajouterEmploye(new manutention1("nassir","limane","14d2fg3",14,2017,5800));
p1.ajouterEmploye(new manutention("sadjo mane","dangior","13ds5555",112,2015,1400));
p1.ajouterEmploye(new production("bouba","madingri","15a41455",112,2017,5220));
p1.ajouterEmploye(new production1("segio","rene jean","114s",40,2101,2540));


p1.afficherSalaire();
System.out.println("Les salaire moyen de cette Entreprise est :" + p1.Salaire_moyen());
}
    }
    

