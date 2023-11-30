package exrcice1_2;

import java.util.Scanner;

public class App {
	/*
	 variable
	 	R est un entier
	 	aire est un entier
	 	volume est un entier 
	 début du programme
	 	afficher " saisir le rayon "
	 	lire R
	 	afficher " l aire est de : "<--aire
	 	aire=4*Pi*R^2
	 	fin du programe 
	 */
public static void main(String[] args) {
	int rayon;
	//int aire;
	double aireSphere;
	double volumeSphere;
	final double pi= Math.PI;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("saisir le rayon");
	rayon = sc.nextInt();
	aireSphere = 4*pi*Math.pow(rayon,2);
	volumeSphere = 4/3*pi*Math.pow(rayon,3);
	
	System.out.println("l'aire de la sphere est de : " + aireSphere);
	System.out.println("le volume de la sphere est de : " + volumeSphere);
	
	sc.close();

	}
}
