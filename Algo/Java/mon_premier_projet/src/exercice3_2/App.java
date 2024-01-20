package exercice3_2;

import java.util.Scanner;

public class App {

	/*
	2. Avec une boucle pour

Variables 
	nombre est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut pour
	pour i allant de 1 à 10
	nombre <-- nombre + 1
	Ecrire nombre," "
	i suivant
Fin pour
Fin du programme
	 */
	public static void main(String[] args) {
			
		int nombre;
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("saisir un nombre : ");
		nombre = sc.nextInt();
		
		for (int i= 1; i<nombre; i++)
		{
			nombre = (nombre/2)+1;
			System.out.println(i);
		}
	
	
		sc.close();
	}

}
