package exercice8;

import java.util.Scanner;

public class App {
	/*
	 variaable 
	 	age, anneePermis, accident, anneeAssurance sont des entier 
	 	condition1, condition2, condition3, condotion4, sont des booleans
	 début du programe
	 	ecrire "saisir un age"
	 		lire age
	 	ecrire"saisir le nombre d année de permis"
	 		lire anneePermis
	 	ecrire"saisir nombre d'accident"
	 		lire accident
	 	ecrire"saisir nombre d'année d'assurance"
	 		lire anneeAssurance 
	 début condition 
	 	condition1<--age<25
	 	condition2<-- anneePermis>2, 0
	 	condition3<--accident=0
	 	condition4<--anneeAssurance>5
	 début du programme
	 	si (conditon1 et !condition2 et condition3)
	 	{
	 		ecrire "tarif rouge"
	 	}
	 	sinon
	 	{
	 		ecrire "votre assurance est refuser"
	 	}
	 	
	 	si (condition1 et condition2, ou condition1 et !condition2 et condition3)
	 	{
	 		écrire "rtarif rouge"
	 	}
	 	sinon
	 	{
	 		ecrire "votre assurance est refuser"
	 	}
	 	si (condition1
	 		
	 */
	public static void main(String[] args) {
		
		int age, anneePermis, accident, anneeAssurance ;
		boolean condition1, condition2, condition3, condition4 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("sais votre age : ");
			age=sc.nextInt();
			
		System.out.println("saisir le nombre d'année de permis : ");
			anneePermis=sc.nextInt();
			
		System.out.println("saisir le nombre d accident : ");
			accident=sc.nextInt();
			
		System.out.println("saisir le nombre d'année d'assurance : ");
			anneeAssurance=sc.nextInt();
			
		condition1= age<25;
		condition2= anneePermis>2;
		condition3= accident==0;
		condition4= anneeAssurance>5;
		
		
			
	}

}
