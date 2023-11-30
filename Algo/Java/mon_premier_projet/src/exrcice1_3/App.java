package exrcice1_3;

import java.util.Scanner;

public class App {
	/*
variable 
	S est un entier 	
	i est un entier
	N est un entier
	
debut du programme 
	ecrire " saisir la somme : "
	lire S
	
	ecrire " saisir le nombre d'année : "
	lire N
	
	ecrire " saisir intérêt : "
	lire i
	
	I simple=S*(1+N*i)
	ecrire " intérêt simple : "<-- I simple 
	
	I composé=S*((1+i)*N)
	ecrire " intérêt composé : "<-- I composé 
	
	
fin du programme 
*/
	public static void main(String[] args) {
		double S;
		double i;
		int N;
		double interet_simple ;
		double interet_composé ;
		
	Scanner sc = new Scanner (System.in); 
	
	System.out.println ("saisir la somme : ");
	S = sc.nextDouble();
	
	System.out.println("saisir Intérêt : ");
	i = sc.nextDouble(); 
	
	System.out.print("saisir le nombre d'année : ");
	N = sc.nextInt();
	
	interet_simple = S*(1+N*i/100);
	System.out.print("Intérêt simple : " + interet_simple+" \n");
	
	interet_composé = S*((1+i/100)*N); 
	System.out.print("Intérêt composé : " + interet_composé );
	
	
	sc.close();
	}

}
