package exrcice1_1;
import java.util.Scanner;
public class App {
/*
 variable
 	nombre1 est un entier
 	nombre2 est un entier
 	moyenne est un entier
 début du programme 
 	afiicher "saisir le nombre"
 	lire nombre1
 	afficher "saisir le nomnre"
 	lire nombre2
 	moyenne= (nombre1+nombre2)/2
 	afficher "la moyenne est de : "
 	lire moyenne 
 fin du programme 
 */
	public static void main(String[] args) {
	// Declaration des variables 
		String mavariable;
		mavariable= "calcul de moyenne";
		int nombre1;
		int nombre2;
		double moyenne;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le 1er nombre");
		nombre1= sc.nextInt();
		System.out.println("saisir le 2eme nombre");
		nombre2= sc.nextInt();
		moyenne=(nombre1+nombre2)/2d;
		System.out.println("la moyenne est de : "+moyenne);
		sc.close();
		
		
		
	}

}
