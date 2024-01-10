package tri_de_nombre;

import java.util.Scanner;

/*
   variable 
   		a est un entier
   		b est un entier
   		c est un entier 
   	début du programme 
   		ecrire " saisir a"
   			lire a
   		ecrire " saisir b" 
   			lire b
   		ecrire " saisr c"
   			lire c
   			
   	début si
   		si (a<b && a<c && b<c) alors
   		 ecrire " l ordre est :" a, b, c,
    début sinon si
   		sinon si (a<b && a<c && c<b) alors
   		 ecrire " l ordre est :" a, c, b 
   	début sinon si
   		sinon si (b<a && b<c && a<c) alors
   			ecrire" l ordre est: " b, a, c
   	début sinon si 
   		sinon si (b<a && b<c && a>c) alors
   			ecrire "l ordre est : b, c, a
   	début sinon si
   		sinon si (c<a && c<b && a<b) alors
   		 	ecrire "l ordre est : c, a, b
   		 sinon si (c<a && c<b && b<a) alors 
   		 	ecrire "l ordre est : c, b, a
   	fin sinon
   	fin si
   	fin du programme	 	
   */
public class App {
	public static void tri(int a,int b,int c)
	{

		if (a<b && a<c && b<c)
		{
			System.out.println("l ordre est : "+a+" "+b+" "+c);
		}
		else if (a<b && a<c && c<b)
		{
			System.out.println("l ordre est : "+a+" "+c+" "+b);
		}
		else if (b<a && b<c && a<c)
		{
			System.out.println("l ordre est : "+b+" "+a+" "+c);
		}
		else if (b<a && b<c && a>c)
		{
			System.out.println("l ordre est : "+b+" "+c+" "+a);
		}
		else if (c<a && c<b && a<b)
		{
			System.out.println("l ordre est : "+c+" "+a+" "+b);
		}
		else if  (c<a && c<b && b<a) 
		{
			System.out.println("l ordre est : "+c+" "+b+" "+a);
		}
		
	}
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("saisr un nombre : ");
			a= sc.nextInt();
		System.out.println("saisir un nombre : ");
			b= sc.nextInt();
		System.out.println("saisir un nombre : ");
			c= sc.nextInt();
		tri(a,b,c);
		sc.close();
	}

}
