package boucle_2;

import java.util.Scanner;

public class App {

	/*
	Variables
			nombre est un entier
		Debut du programme
		nombre<-- 0
		Debut tant que
			tant que nombre < 10 OU nombre > 20
			faire
				Ecrire "Saisir un nombre entre 10 et 20
				Lire nombre
				Debut si
					si nombre < 10
					Alors Ecrire "Plus grand !"
					Sinon Si nombre > 20
					Alors Ecrire "Plus petit"
					Sinon Ecrire "Nombre valide"
				Fin Si
		Fin tant que
		fin du programme
	 */

	public static void main(String[] args) {
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		nombre = 0 ;
		while (nombre<10 || nombre>20)
			{
		System.out.print("veuillez saisir un nombre : ");
				
		nombre  = sc.nextInt();
			
		
				if (nombre<10)
					{
						System.out.println("veuillez saisir un nombre plus grand merci. ");
					}
				else if (nombre>20)
					{
						System.out.println("veuillez saisir un nombre plus petit merci. ");
					}
				else
					{
						System.out.println("merci nombre valide.");
					}
			}
		sc.close();	
	}

}
