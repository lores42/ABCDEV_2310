package exercice2_3;

import java.util.Scanner;

public class App {
	/*
variable

	a est un entier	
	b est un entier
	c est un entier
début du programme

	ecrire " saisir le nombre a "
	lire: a
	
	ecrire " saisir le nombre b "
	lire: b
	
	ecrire " saisir le nombre c "
	lire: c 
	
	si a<=b et a<=c
	  si b<=c alors 
	  	ecrire "a-b-c"
	  sinon 
	  ecrire a-c-b
	  
	si b<=a et b<=c
	  	si a=>c alors 
	  	ecrire " b-c-a " 
	  	sinon
	  	ecrire " b-a-c "
	  	
	si a=>c et b=>c
		si a=>b alors 
		ecrire " c-b-a "
		sinon
		ecrire " c-a-b "
	  	
	
	 */
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
	Scanner sc = new Scanner (System.in); 

	System.out.println("saisir le nombre a: ");
		a= sc.nextInt();
		
	System.out.println("saisir le nombre b:");
		b= sc.nextInt();
		
	System.out.println("saisir le nombre c: ");
		c= sc.nextInt();
		
		if (a<=b && a<=c)
		{
			if (b <= c)
			{
			 System.out.println( a+" "+b+" "+c);
			}
			else 
			{
				System.out.println( a+" "+c+" "+b );			
			}	
		}
		else if (b<=a && b<=c)
		{
			if(c <= a) 
			{
				System.out.println( b+" "+c+" "+a );
			}
			
			else 
			{
				System.out.println( b+" "+a+" "+c );
			}
		}
		else 
		{
			if (a<=b) 
			{
				System.out.println( c+" "+a+" "+b );
			}
			
			else
			{
				System.out.println( c+" "+b+" "+a );
			}
		}
		
		sc.close();
		}
	}


