package jeu_de_la_fourchette;

import java.util.Random;
import java.util.Scanner;


/*
	 variable 
	 	nombre est un entier 
	 	n_max est un entier 
	 	n_min est un entier 
	 	fourchette est un entier 
	 
	 début de programme 
	 	
	 	ecrire "saisir un nombre"
	 	 	lire nombre
	 	 	
	 	 si ( nombre == fourchette )
	 	    lire fourchette 
	 	    ecrire " c est le nombre exacte "
	 	    
	 	 sinon ( nombre < fourchette)
	 	 	ecrire " le nombre est superireur a :"+ nombre
	 	 	
	 	 sinon si (nombre > fourchette )
	 	 	ecrire "le nombre est inferireur a :" + nombre 
	 	 	
	 	tantque  ( i!= fourchette )	
	 */
public class App {

	public static void main(String[] args) {
		int max, min, nombre, nb;
		max = 100; 
		min = 0;
		
		Random rand = new Random();
	Scanner sc = new Scanner(System.in);
		
		nb = rand.nextInt(max - min +1) +min;
		
		System.out.println("saisir un nombre");
		  nombre = sc.nextInt(); 
		  
		if (nombre == nb) 
			{
				System.out.println("c'est le nombre exact!!!");
			}
		else if (nombre < nb)
			{
				System.out.println("le nombre est supèrieur à : "+nombre);
			}
		else if (nombre > nb)
			{
				System.out.println("le nombre set inférieure à : "+nombre);
			}
		
		if (nombre == nb)
			{
				System.out.println("vous avez trouvez le bon nombre : "+nombre);
			}


	sc.close();
	}

}
