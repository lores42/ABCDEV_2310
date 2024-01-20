package exrecice5;

import java.util.Scanner;

public class App {
	/*
	 variable
	 	prix est un décimal
		copie est un entier
	 début du programme 
	 
	 	ecrir " saisir le nombre de photocopie "
	 		lire copie
	 	prix1<--0,10€
	 	prix2<--0.09€
	 	prix3<--0.08€
	 	
	 	début Si
	 		Si ( copie>=1 ou copie<=10)
	 		alors 
	 			copie*prix1
	 	fin Si
	 
	 	début Si
	 		Si (copie>=11 ou copie<=20)
	 			alors
	 				copie*prix2
	 	fin Si
	 
	 	début Si
	 		Si (copie>=21)
	 			alors
	 				copie*prix3
	 	fin Si
	 
	 ecrie "vous avez demander : ",copie," sela vous a coutez : ",prix 
	 */
		
	public static void main(String[] args) {
		
			double  prix1, prix2, prix3, resultat=0;
			int copie;
			
		Scanner sc = new Scanner(System.in);
			prix1 =0.10;
			prix2 =0.09;
			prix3 =0.08;
			
		System.out.print("saisir le nombre de copie souhaitez : ");
			copie =sc.nextInt();
			
		//début de Si
			if (copie>=1 && copie<=10)
				{
					resultat=copie*prix1;
				}
			if (copie>=11 && copie<=20)
				{
					resultat=copie*prix2;
				}
			if (copie>=21)
				{
					resultat=copie*prix3;
				}
			
		System.out.println("vous avez demandez : "+copie+" cela vous coutera : "+resultat);
	
		sc.close();
	}
		
}
