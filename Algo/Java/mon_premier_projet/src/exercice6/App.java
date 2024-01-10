package exercice6;

import java.util.Scanner;

public class App {
	/*
	 variable
	 	age est un entier 
	 	sexe est une chaine de carctère 
	 	condition1 est un boolean 
	 	condition2 est un boolean
	 	
	 début de programmme 
	 	ecrire " saisir votre sexe "
	 		lire sexe
	 	ecrire " saisir votre age "
	 		lire age
	 	condition1<-- genre M et age>20
	 	condition2<-- genre F et (age>=18 et age<=35)
	 	//début de Si
	 	 Si homme > 20ans 
	 	 	alors
	 	 		imposable
	 	// fin de Si
	 	 
	 	//début de Si
	 	 	Si femme => 18ans ou femme<=35
	 	 		alors
	 	 			imposable
	 	//fin de Si
	 	  
	 	  écrire " vous êtes imposable  "
	 */
	public static void main(String[] args) {
		
			int age;
			String sexe, homme, femme ;
			boolean imposable, condition1, condition2 ;
			
	Scanner sc = new Scanner(System.in);
	//début du programme 
		System.out.println("saisir votre sexe (homme ou femme)");
			sexe = sc.next();
			
		System.out.println("saisir votre age");
			age = sc.nextInt();
			
			condition1 = sexe.equals ("homme") && age>=20;
			condition2 = sexe.equals ("femme") && age>=18 && age<=35;
		//début du Si
			if (condition1|| condition2)
				{
					System.out.println (" vous etes imposable !");
				}
			else
				{
					System.out.println(" vous n êtes pas imposable !");
				}
			sc.close();
	}
}
