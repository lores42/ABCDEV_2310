package exercice_7;

import java.util.Scanner;

public class App {
	/*
	 Variables
	candidat1, candidat2, candidat3, candidat4 sont des reels
	condition1, condition2, condition3, condition4 sont des booleens
Debut du programme
	Ecrire "Saisir le score du candidat 1 :"
	Lire candidat1
	Ecrire "Saisir le score du candidat 2 :"
	Lire candidat2
	Ecrire "Saisir le score du candidat 3 :"
	Lire candidat3
	Ecrire "Saisir le score du candidat 4 :"
	Lire candidat4
	condition1 <-- candidat1 > 50
	condition2 <-- candidat2 > 50 OU candidat3 > 50 ou candidat4 > 50
	condition3 <-- candidat1 >= candidat2 ET candidat1 >= candidat3 ET candidat1 >= candidat4
	condition4 <-- candidat1 >= 12,5
Debut Si
	Si condition1 = vrai
	Alors Ecrire "Elu au premier tour"
	Sinon Si condition2 = vrai OU condition4 = faux
	Alors Ecrire "Battu, eliminé, sorti !!!"
	Sinon Si condition3 = vrai
	Alors Ecrire "Ballotage favorable"
	Sinon Ecrire "Ballotage defavorable"
Fin Si
Fin du programme     
	 */
	public static void main(String[] args) {
	 
		double candidat1, candidat2, candidat3, candidat4;
		boolean condition1, condition2, condition3, condition4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("score du candidat 1 :" );
		  	candidat1 = sc.nextDouble();
		 
		System.out.println("score du candiat 2 :");
			candidat2 = sc.nextDouble();
			
		System.out.println("score du candidat 3 :");
			candidat3 = sc.nextDouble();
			
		System.out.println("score du candidat 4 :");
			candidat4 = sc.nextDouble();
			
			
		condition1= candidat1> 50;
		condition2= candidat2>50 || candidat3> 50 || candidat4> 50 ;
		condition3= candidat1>= candidat2 & candidat1 >= candidat3 & candidat1 >= candidat4 ;
		condition4= candidat1>=12.5;
		
		if (condition1 )
			{
				System.out.println("Élu au premier tour");
			}
			
		else if (condition2 || !condition4)
			{
				System.out.println("candidat battu");
			}
		else if ( condition3)
			{
				System.out.print("Ballotage favorable");
			
			}
		else 
		{
			System.out.println("Ballotage defavorable");
		}
			
		sc.close();
	}

}
