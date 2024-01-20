package exercice3;

import java.util.Scanner;

public class App {
	/*
	 variable 
	 	age est un entier 
	 	Pousin, Pupille, Minime, Cadet sont des chaine carctère 
	 début de l algoritme 
	 	écrire " saisir un age "
	 		lire age
	 		
	 		si age est < que 6ans 
	 			écrire " vous êtes trop jeune "
	 			
	 		si age est = à 6ans et age <= à 7ans 
	 			écrire " vous êtes en Pousin "
	 			
	 		si age est = à 8ans et age <= à 9ans 
	 			écrire " vous êtes en Pupille "
	 			
	 		si age est = à 10ans et age <= à 11ans 
	 			écrire " vous êtes en Minime "
	 			
	 		si age est = à 12ans
	 			écrire " vous êtes en Cadet "
	 			
	 	fin du programme 
	 */
	public static void main(String[] args) {
		
		int age;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("saisir votre age : ");
		age = sc.nextInt();
		
		if (age<6)
			{
				System.out.println(" vous êtes trop jeune. ");
			}
			else  if (age<=6 || age>=7)
				{
					System.out.println(" vous êtes en Pousin. ");
				}
			else if (age<=8|| age>=9)
				{
					System.out.println(" vous êtes en Pupille. ");
				}
			else if (age<=10 || age>=11)
				{
					System.out.println(" vous êtes en Minime. ");
				}
			else if (age<=12)
				{
					System.out.println(" vous êtes en Cadet. ");
				}
		sc.close();

	}

}
