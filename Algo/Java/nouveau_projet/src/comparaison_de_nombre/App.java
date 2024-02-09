package comparaison_de_nombre;

import java.util.Scanner;

public class App {
/*
 VARIABLES
	age est un entier
Debut du programme
	Ecrire "Quel est votre age ?"
	Lire age
	Debut Si
		Si age >= 18
		Alors
			Ecrire "Vous êtes majeur"
		Sinon Si age < 0 
			Alors
			Ecrire "Vous n'êtes pas encore né"
		Sinon
			Ecrire "Vous êtes mineur"
	Fin Si
Fin du programme
 */
	public static void main(String[] args) {
		
	int  age;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("saisir votre age");
		age=sc.nextInt();
	
		if (age>=18)
		{
			System.out.println("vous etes majeurs");
		}
		
		else if (age<0)
		{
			System.out.println("vous n'êtes pas née!!!");
		}
		else 
		{
			System.out.println("vous etes mineur!!!");
		}
		
		 sc.close();
		
	}

}
