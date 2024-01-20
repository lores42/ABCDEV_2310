package exercice7;

import java.util.Scanner;

public class App {
	/*
	 variable
	 	candidat1, candidat2, candidat3, candidat4 sont des réels
	 	condition1, condition2, condition3, condition4, condition5, boolean
	 début du prgramme
	 	ecrire "saisir le score du candidat n°1"
	 		lire candidat1
	 	
	 	ecrire "saisir le score du candidat n°2"
	 		lire candidat2
	 		
	 	ecrire "saisir le score du candidat n°3"
	 		lire candidat3
	 		
	 	ecrire "sasir le score du candodat n°4"
	 		lire candidat4
	 		
	 	condition1<--canidat1>50 élut au premier tour
	 	
	 	condition2<--candidat2>=50 ou candidat3>=50 ou candidat4>=50
	 	
	 	condition3<--candidat1>=candidat2 et candidat1>=candidat3 et candidat1>=candidat4
	 	
	 	condition4>--candidat1>=12.5
	 	
	 	Début de Si
	 	
	 	si condition1
	 		{
	 			ecrire "élu au prmier tour"
	 		}
	 		
	 	sinon si condition2
	 		{
	 			 candidat éliminé
	 		}
	 		
	 	sinon si condition3
	 		{
	 			second tour ballottage favorable 
	 		}
	 		
	 	sinon condition4
	 		{
	 			ballottage défavorable
	 		}
	 	
	 	fin de si 
	 	
	 	fin de programme 
	 	
	 */
	public static void main(String[] args) {
		
		
		
		double  candidat1, candidat2, candidat3, candidat4;
		boolean condition1, condition2, condition3, condition4;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le score du candidat 1");
			candidat1 = sc.nextDouble();
			
		System.out.println("saisir le score du candidat 2");
			candidat2 = sc.nextDouble();
			
		System.out.println("saisir le score du candidat 3");
			candidat3 = sc.nextDouble();
			
		System.out.println("saisir le score du candidat 4");
			candidat4 = sc .nextDouble();
		
		condition1  =  candidat1>=50;
		
		condition2 = candidat2>=50 || candidat3>=50 || candidat4>=50;
		  
		condition3 = candidat1>=candidat2 && candidat1>=candidat3 && candidat1>=candidat4;
		
		condition4 =candidat1>=12.5;
		
		//début de Si
		if (condition1)
			{
				System.out.println("élu au premier tour");
			}
		else if (condition2)
			{
				System.out.println("candidat1 éliminé");
			}
		else if (condition3)
			{
				System.out.println("second tour ballottage favorable");
			}
		else if (condition4)
			{
				System.out.println("second tour ballotage défavorable");
			}
		sc.close();
	}

}
