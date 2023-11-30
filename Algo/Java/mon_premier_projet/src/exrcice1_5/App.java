package exrcice1_5;

import java.util.Scanner;

public class App {
/*
 variable 
 	a est un entier
 	b est un entier
 	c est un entier 
 début du programe
 	afficher " saisir un nombre "	
 	lire a
 	afficher " saisir un nombre "
 	lire b
 	c<--a
 	a<--b
 	b<--c 
 	afficher a 
 	afficher b  
 	fin du programme 
 	
 */
	public static void main(String[] args) {
	
		int a;
		int b;
		int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("saisir nombre a : ");
	a = sc.nextInt();
	System.out.println("saisir nombre b : ");
	b = sc.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("nouvelle valeur de a :" + a);
	System.out.println("nouvelle valeur de b :" + b);
	

	}

}
