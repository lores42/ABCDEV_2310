package exercic2_2;

import java.util.Scanner;

/*
 variable 
 	a est un entier
 	b est une entier 
 début du programme 
 	ecrire " saisir nombre a "
 	lire a
 	ecrire " saisir nombre b "
 	lire b
 	si (a<b)
 		ecrire "a:",a
 		ecrire "b:",b
 	sinon ecrire "b:",b
 		ecrire "a:",a
 */
public class App {

	public static void main(String[] args) {
		int a;
		int b;
		
	Scanner sc = new Scanner(System.in);

	System.out.println(" saisir nombre a: ");
		a = sc.nextInt();
		
	System.out.println(" saisir nombre b: ");
		b = sc.nextInt();
		
			if (a<b) {
				System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			else {
				System.out.println("b: "+b);
				System.out.println("a: "+a);
			}
			
			sc.close();
	}
}
