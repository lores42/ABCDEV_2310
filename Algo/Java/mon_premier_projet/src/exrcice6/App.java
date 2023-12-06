package exrcice6;

import java.util.Scanner;

/*
  variable 
  	age est un entier
  	sexe est une chaine de caractère
  	 homme est une chaine de caractère
  	 femme est une chaine de caractère 
  	les autres est une chaine de caractère  
  début du programe
   	ecrire " saisir votre sexe "
   		lire sexe 
   	ecrire "saisir votre age " 
   		lire age
   	si ( homme> 20ans )	
   		paye impots 
   	si ( femme> 18ans ou femme< 35ans )
   		paye impots
 */
public class App {

	public static void main(String[] args) {
		int age;
		String sexe; 
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("saisir votre sexe : ");
	 sexe =sc.next(); 
	
	 
	System.out.println("saisir votre age : ");
		age = sc.nextInt(); 
		if (sexe.equals("homme")) 
		{
			if ( age>=20 )
				{
				System.out.println("paye ses impots");
				}
					else
						{
							System.out.println("ne pas d impots");
						}
		}
		if ( sexe.equals("femme")) {
			if ( age>=18 && age<=35)
				{
					System.out.println("paye ses impots");
				}
				else
					{
						System.out.println("ne paye pas d impots");
					}
		}
	
	sc.close();
	}
}
