package procedure_fonction_p2_exo1;

import java.util.Scanner;

public class App {
	
	public static int somme_de_nombre(int nbr1, int nbr2, int nbr3, int nbr4, int nbr5)
	{
		int somme_total = nbr1+nbr2+nbr3+nbr4+nbr5;
		
		return somme_total;
	}

	public static void main(String[] args) {
		 
		int nbr1, nbr2, nbr3, nbr4, nbr5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir chiffre1 : ");
		nbr1 = sc.nextInt();
		System.out.println("saisir chiffre2 : ");
		nbr2 = sc.nextInt();
		System.out.println("saisir chiffre3 : ");
		nbr3 = sc.nextInt();
		System.out.println("saisir chiffre4: ");
		nbr4= sc.nextInt();
		System.out.println("saisir chiffre5: ");
		nbr5= sc.nextInt();
		
		int total= somme_de_nombre( nbr1, nbr2, nbr3, nbr4, nbr5);
		
		System.out.println("la somme des nombres est de : "+total);
		
	
	}

	
}
