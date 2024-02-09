package procedur_exercice1;

import java.util.Scanner;

public class App {
	/*
	 variable 
	 	cb est un entier 
	 	virement est un entier 
	 	chèque est un entier
	 	payementTotal est un entier
	 	résultat cb est un réel
	 	résultat virement est un réel
	 	résultat chèque est un réel
	 	
	 début programme 
	 	ecrire " saisir le nombre de paiment par carte bleu 
	 		lire cb
	 	ecrire " saisir le nombre de chéques émi "
	 		lire chèque
	 	ecrire " saisir le nombre de virement automatique "
	 		lire virement 
	 		
	 	payementTotal<-- cb+chéque+virement 
	 	
	 	si (résultat cb)
	 		{
	 			cb/ payementTotal * 100
	 		}
	 	si (résultat chèque)
	 		{
	 			chèque/ payementTotal * 100
	 		}
	 	si (résultat virement)
	 		{
	 			virement/ payementTotal * 100
	 		}
	 		ecrire "le pourcentage de carte bleu est de : "
	 			lire résultat cb
	 		ecrire " le pourcentage de chèque est de : "
	 			lire résultat chéque
	 		ecrire " le pourcentage de virement est de : "
	 			lire résultat virement 
	 */
	public static void main(String[] args) {
		double cb, chèque, virement, payementTotal ;
		double resultat_cb, resultat_cheque, resultat_virement;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le nombre de payement par carte bleu :");
			cb = sc.nextInt();
			
		System.out.println("saisir le nombre de payement par chèque :");
			chèque = sc.nextInt();
			
		System.out.println("saisir le nombre de payement par virement :");
			virement = sc.nextInt();
			
		payementTotal = (cb + chèque + virement);
		
		resultat_cb= (cb/payementTotal) *100;
		System.out.println("le pourcentange de payement par carte bleu est de :"+resultat_cb);
		
		resultat_cheque = (chèque/payementTotal) *100;
		System.out.println("le pourcentange de payement par chèque est de :"+resultat_cheque);
		
		resultat_virement =( virement/payementTotal) *100;
		System.out.println("le pourcentange de payement par virement :"+resultat_virement);
		
		sc.close();
	}

}
