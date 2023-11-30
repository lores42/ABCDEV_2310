package exrcice2_4;

import java.util.Scanner;

public class App {

/*
 variable
 	année est un entier 
 début du programme 
 	ecrire " saisir une année "
 	lire année 
 	Si année modulo 4 = 0 et année modulo 100 =0 et année modulo 400 != 0
 */
	public static void main(String[] args) {

		int annee;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("saisire une année :");
			annee = sc.nextInt(); 

		if (annee % 4 ==0 && annee % 100 == 0 && annee % 400 != 0)
		{
		
			System.out.println(" C'est une année bissextile. ");
		}
		else 
		{
			
				System.out.println("Ce n'est pas une année bissextile. ");

		}
		sc.close();
		}
	}
