package exrcice2_1;
/*
 variable 
 	age est un entier 
 début du programme 
 	ecrire "saisir votre age "
 		lire age 
 	si (age<0)	
 		ecrire vous n êtes pas née 	
 	si ( age >=o ou age >= 17)
 	 ecrire "vous êtes mineur!!"
 	sinon 
 	 ecrire" vous êtes majeur!!"
 	 
 fin du programme 
 	  */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int age;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("saisir votre age : ");
			age = sc.nextInt(); 
		
		
		if (age>=18)
			{
				System.out.println("vous êtes majeur!!!");
			}
		 
			else if (age >=0 && age<=17)
		 	{
			 	System.out.println("vous êtes mineur!!!");
		 	}
		 if (age<0)
			{
				System.out.println("vous n'êtes pas encore néé!!!");
			}
		
		
		sc.close();
	}
	

}
