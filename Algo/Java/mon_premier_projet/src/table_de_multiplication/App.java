package table_de_multiplication;

import java.util.Scanner;

/*
 variable 
 	nombre est un entier 
 	i est entier
 	resultat est un entier 
 	nombre est <=o et >=10
 début du programe 
 	écrire " saisir un nombre entre un et 10"	
 		lire nombre 
 	pour nombre	
 */
public class App {

	public static void main(String[] args) {
	// déclarer variable 
		int nombre;
		int i;
		int resultat; 
		
	Scanner sc = new Scanner(System.in);
	// début du programme 
	System.out.println("saisir un nombre entre  et 10 : ");
		nombre = sc.nextInt();
	// début de conditon	
		if (nombre>=1 || nombre<=10)
		{
			for (i = 0;i<=10;i++)
			{
				resultat=i*nombre;
			 System.out.println(i+"*"+nombre+"="+resultat);
			}
		}
		sc.close();
	}

}
