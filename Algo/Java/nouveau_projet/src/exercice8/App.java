package exercice8;

import java.util.Scanner;

public class App {
	/*
	 	/*
	Variables
	age, annePermis, nbAccident, anneAssurance sont des entiers
	condition1, condition2, condition3 sont des booleens
	situation est une chaine de caracteres
Debut du programme
	Ecrire "Saisir l'age : "
	Lire age
	Ecrire "Saisir le nombre d'annees de permis"
	Lire annePermis
	Ecrire "Saisir le nombre d'accidents : "
	Lire nbAccident
	Ecrire "Saisir le nombre d'annees d'assurance : "
	Lire anneeAssurance
	condition1 <-- age >= 25
	condition2 <-- annePermis >= 2
	condition3 <-- anneAssurance > 5
Debut Si
	Si condition1 = faux ET condition2 = faux
	Alors
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
	Sinon Si (condition1 = faux ET condition2 = vrai) OU (condition1 = vrai ET condition2 = faux)
	Alors
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Orange"
			Sinon Si nbAccident = 1 
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
	Sinon
		Debut Si
			Si nbAccident = 0
			Alors situation <-- "Vert"
			Sinon Si nbAccident = 1
			Alors situation <-- "Orange"
			Sinon Si nbAccident = 2
			Alors situation <-- "Rouge"
			Sinon situation <-- "Refuser"
		Fin Si
Fin Si
Debut Si
	Si condition3 = vrai
	Alors 
		Debut Si
			Si situation = "Rouge"
			Alors situation <-- "Orange"
			Sinon Si situation = "Orange"
			Alors situation <-- "Vert"
			Sinon Si situation = "Vert"
			Alors situation <-- "bleu"
		Fin Si
Fin Si
Ecrire "Votre situation : ",situation
Fin du programme 
	 */
	public static void main(String[] args) {
		int age, anneePermis, nbAccident, anneeAssurance;
		boolean condition1; 
		boolean condition2; 
		boolean condition3;
		String situation ="" ;
		Scanner sc = new Scanner(System.in);
		
		//début du programme 
		
		System.out.print("saisrl age de l assuré : ");
			age = sc.nextInt();
		System.out.print("saisir les années de permis de l assuré : ");
			anneePermis = sc.nextInt();
		System.out.print("saisir le npmbre d accident de l assuré : ");
			nbAccident =sc.nextInt();
		System.out.print("saisir le nombre d année d assurance de l'assuré : "); 
			anneeAssurance = sc.nextInt();
			
		condition1 = age>=25;
		condition2 = anneePermis>=2;
		condition3 = anneeAssurance >5;
		
		if (condition1 == false && condition2 == false)
				//Alors
				//	Debut Si
			{
				if (nbAccident == 0)
					{
					 situation = "Rouge";
					}
				else
					{
					situation = "Refuser";
					}
			}
						
					//Fin Si
		else if ((condition1 == false && condition2 == true) || (condition1 == true && condition2 == false))
		//Alors
			//Debut Si
				if ( nbAccident == 0 )
				//Alors 
					{
						situation = "Orange";
					}
				else if ( nbAccident == 1 )
					//Alors 
					{
						situation = "Rouge";
					}
				else
					{
						situation ="Refuser";
					}
			//Fin Si
		//Debut Si
		if ( condition3 = true )
		//Alors 
			//Debut Si
				if ( situation == "Rouge")
				//Alors 
				{
					situation ="Orange";
				}
				else if ( situation == "Orange" )
				//Alors
				{
					situation ="Vert";
				}
				else if (situation == "Vert")
				//Alors 
				{
					situation = "bleu";
				}
			//Fin Si
		System.out.print("votre situation est : "+ situation);
		
		sc.close();
	}

}
