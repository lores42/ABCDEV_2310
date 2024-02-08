package procedur_fonction_exo1;

import java.util.Scanner;

/*
	 Variable
	 	cb est un entier 
	 	chèque est un entier 
	 	virement est un entier
	 	pourcentage est un entier
	 	nombre de payement est un entier 
	 début du programme 
	 	écrire (" saisir le nombre de payement par carte bleu ")
	 	lire :cb
	 	écrire (" saisir le nombre de payement par chèque ")
	 	lire :chèque
	 	écrire (" saisir le nombre de payement par virment ")
	 	lire :virment 
	 
	 	calcul du porcentage 
	 	par carte bleur 
	 	(5/20)*100
	 	par chèque
	 	(10/20)*100
	 	par virement
	 	(5/20)*100
	 	
	 	écrire (" le pourcentage de payement par carte bleu est de " + par cate bleu)
	 	écrire (" le pourcentage de payement par chèque est de " + par chèque)
	 	écrire (" le pourcentage de payement par virement est de "+ par virement)
	 */
public class App {
	public static double[] pourcentage(int cb, int cheque, int virement, int nbrPayement, double pourcentage )
	{
		double nbrPayement1 = cb+cheque+virement;
		double[] pourcentage1 = new double[3];
		pourcentage1[0]=(cb/nbrPayement1)*100;
		pourcentage1[1]=(cheque/nbrPayement1)*100;
		pourcentage1[2]=(virement/nbrPayement1)*100;
		return pourcentage1;
	}
	public static void main(String[] args) {
		
		int cb = 0, cheque = 0, virement = 0, nbrPayement;
		double[]resultat;
		
	//début du programme 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("saisir le nombre de payement par carte bleu : ");
		cb =sc.nextInt();
		
		System.out.println("saisir le nombrede payement par chèque : ");
		cheque = sc.nextInt();
		
		System.out.println("saisir le nombre de payement par virement : ");
		virement = sc.nextInt();
		nbrPayement = cb+virement+cheque;
	// calcul du porcentage	
		resultat= pourcentage(cb,cheque,virement, nbrPayement, 0);
		//pourcentage[0];	
		System.out.println("le pourcentage de payement par carte bleu est de : "+resultat[0]);
		//pourcentage[1];
		System.out.println("le pourcentage de payement par chèque est de : "+resultat[1]);
		//pourcentage[2];
		System.out.println("le pourcentage de payement par virement est de : "+resultat[2]);
		
		
		
		sc.close();
		}
}
