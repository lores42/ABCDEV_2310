package tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int[] tableau = new int[5];
		int variable ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("combien voulez vous de valeur dans votre tableau :");
		variable = sc.nextInt();
		tableau = new int[variable];
		int i = 0;
		for ( i = 0; i<=tableau.length-1; i++);
		{
			System.out.println("assigné une valeur ");
			tableau[i]= sc.nextInt();
		}
		
		int j =0;
		for ( j=0 ; j<=tableau.length; j++)
		{
			System.out.println(tableau[j]+" ");
		}
		}

}
