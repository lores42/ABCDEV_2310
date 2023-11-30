package exercice2_1;

import java.util.Scanner;

/*
 variable 
 	a est un entier 
 début du programe 
 	ecrire " saisi un age : "
 	lire a
 	si( a <0 )
 	ecrire " vous n etes pas née "
 	sinon si ( a>=0 et a<18 )
 	ecrire " vous etes mineur "
 	sinon 
 	ecrire " vous etes majeur "
 	
 */
public class App {

	public static void main(String[] args) {
			int a;
	Scanner sc = new Scanner(System.in);
		System.out.println("saisir un age : ");
		a = sc.nextInt();
		
			if (a<0) {
				System.out.println(" vous n'êtes pas née ");
			}
			
			else if (a>=0 && a<=17) {
				System.out.println(" vous êtes mineur ");
			}
			
			else {
				System.out.println(" vous etes majeur ");
			}	
	sc.close(); 
	}
	 
	}
